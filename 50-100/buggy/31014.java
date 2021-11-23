@org.springframework.web.bind.annotation.RequestMapping(value = "/getInfo", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(@org.springframework.validation.annotation.Validated
com.multicert.bean.CountryDetail countryDetail, org.springframework.ui.Model model) {
    com.multicert.controller.MulticertController.logger.info("/getInfo visited.");
    com.multicert.bean.MulticertResponse response = new com.multicert.bean.MulticertResponse();
    try {
        response = this.service.getCountryInfo(countryDetail.getCountryCode());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    model.addAttribute("countryInfo", response);
    return "countryInfo";
}