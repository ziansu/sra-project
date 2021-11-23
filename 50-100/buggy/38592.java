@org.springframework.web.bind.annotation.CrossOrigin
@org.springframework.web.bind.annotation.RequestMapping(value = "/rest/localize/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.ArrayList<java.lang.String> localize(javax.servlet.http.HttpServletRequest request) {
    java.util.Locale localeCode = resolver.resolveLocale(request);
    localization.localization_api.LocalizationController.log.info("Start localize");
    java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (localization.localization_api.Config localConfig : repo.findByApplicationNameAndLocaleCode("Scholar", localeCode.getLanguage())) {
        list.add(localConfig.localizedString);
        java.lang.System.out.println(localConfig);
        java.lang.System.out.println(localConfig.localizedString);
    }
    java.lang.System.out.println(list);
    return list;
}