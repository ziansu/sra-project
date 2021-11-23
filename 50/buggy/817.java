@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String init() throws java.lang.Exception {
    createCountries();
    createCountryDescription();
    createZones();
    createCurrencies();
    createModules();
    createMerchantStore();
    return "";
}