@org.springframework.security.access.prepost.PreAuthorize(value = ("hasAuthority('" + (de.fred4jupiter.fredbet.security.FredBetPermission.PERM_ADMINISTRATION)) + "')")
@org.springframework.web.bind.annotation.RequestMapping(path = "/createEmMatches", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView createDemoMatches(org.springframework.ui.ModelMap modelMap) {
    dataBasePopulator.createEM2016Matches();
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("admin/administration");
    messageUtil.addInfoMsg(modelMap, "administration.msg.info.demoMatchesCreated");
    return modelAndView;
}