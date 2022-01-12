@app.soa4.controller.RequestMapping(value = "/auth", method = RequestMethod.POST)
public java.lang.String auth(@app.soa4.controller.RequestAttribute(value = "token")
java.lang.String token, @app.soa4.controller.RequestAttribute(value = "information")
app.soa4.model.User user) throws com.fasterxml.jackson.core.JsonProcessingException {
    java.util.HashMap<java.lang.String, java.lang.Object> mappingResponse = new java.util.HashMap<java.lang.String, java.lang.Object>();
    mappingResponse.put("token", token);
    mappingResponse.put("user", user);
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    return mapper.writeValueAsString(mappingResponse);
}