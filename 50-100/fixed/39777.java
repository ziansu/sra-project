@org.springframework.web.bind.annotation.RequestMapping(value = { "/argos/measure" })
@org.springframework.web.bind.annotation.ResponseBody
private java.lang.String getArgosMeasureData(@org.springframework.web.bind.annotation.RequestParam
short domain_id, @org.springframework.web.bind.annotation.RequestParam
long from_time, @org.springframework.web.bind.annotation.RequestParam
long to_time, @org.springframework.web.bind.annotation.RequestParam(required = false, defaultValue = "jennifer")
java.lang.String customer_id) throws java.net.MalformedURLException {
    java.net.URL u = new java.net.URL((((((((((com.jennifersoft.ctrl.ArgosController.ARGOS_API_URL) + "?func_name=getMeasureDataListForJennifer&domain_id=") + domain_id) + "&customer_id=") + customer_id) + "&from_time=") + from_time) + "&to_time=") + to_time));
    return getArgosContents(u, true);
}