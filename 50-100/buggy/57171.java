@org.springframework.web.bind.annotation.RequestMapping(value = "/index")
public java.lang.String helloJsp(@org.springframework.web.bind.annotation.RequestParam(value = "clientId", required = false)
java.lang.String clientId, java.util.Map<java.lang.String, java.lang.Object> model) throws java.io.IOException, java.text.ParseException {
    java.lang.System.out.println(clientId);
    if (!(org.springframework.util.StringUtils.isEmpty(clientId))) {
        com.abtest.web.GetAbTest getAbTest = new com.abtest.web.GetAbTest();
        java.util.List result = getAbTest.getAB("_tra", clientId);
        model.put("result", result);
        java.lang.System.out.println(result);
    }
    return "helloJsp";
}