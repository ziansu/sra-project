@org.springframework.web.bind.annotation.RequestMapping(value = { "/" , "/" + (co.porkopolis.utils.FileConstants.HOME_PAGE) }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String home(@org.springframework.web.bind.annotation.ModelAttribute
co.porkopolis.model.SummonerName summonerName, org.springframework.ui.Model model) {
    if ((summonerName == null) || ((summonerName.getName()) == null)) {
        return co.porkopolis.utils.FileConstants.HOME_PAGE;
    }
    co.porkopolis.model.BasicSummoner summoner = request.requestBasicSummoner(summonerName.getName());
    if (summoner != null) {
        model.addAttribute(AttributeConstants.BASIC_SUMMONER, summoner);
        return co.porkopolis.utils.FileConstants.INDEX;
    }else {
        model.addAttribute(AttributeConstants.ERROR, (("Summoner " + (summonerName.getName())) + " not found."));
        return co.porkopolis.utils.FileConstants.HOME_PAGE;
    }
}