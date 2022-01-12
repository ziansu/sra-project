@org.springframework.web.bind.annotation.RequestMapping(value = "/mareanoPolar_en")
public org.springframework.web.servlet.ModelAndView getMareanoPolarEn(javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
    if (((mavPolarEn) == null) || (((java.lang.System.currentTimeMillis()) - (mavLastUpdatedPolarEn)) > (no.imr.geoexplorer.admindatabase.controller.MareanoController.ONEHOUR))) {
        mavPolarEn = commonGetMareano(resp, no.imr.geoexplorer.admindatabase.controller.MareanoController.EN, "mareanoPolar_en");
        mavLastUpdatedPolarEn = new java.util.Date().getTime();
    }
    polarConfig(mavPolarEn);
    return mavPolarEn;
}