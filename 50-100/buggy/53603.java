@org.springframework.web.bind.annotation.RequestMapping(method = { org.springframework.web.bind.annotation.RequestMethod.GET }, value = "/getStockNames")
public java.lang.String stockNames() {
    java.lang.String[] names = m.getNames();
    javax.json.JsonArrayBuilder createArrayBuilder = javax.json.Json.createArrayBuilder();
    for (java.lang.String s : names) {
        javax.json.JsonObjectBuilder add = javax.json.Json.createObjectBuilder().add("name", s);
        createArrayBuilder.add(add);
    }
    return javax.json.Json.createObjectBuilder().add("companies", createArrayBuilder).build().toString();
}