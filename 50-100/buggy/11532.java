@org.springframework.web.bind.annotation.RequestMapping(value = "/filter", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public final void getGrants(@org.springframework.web.bind.annotation.RequestBody
final java.lang.String json, final javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    gov.ehawaii.hacc.web.controllers.MainController.LOGGER.info(("JSON: " + json));
    java.util.Map<java.lang.String, java.lang.Object> parameters = new com.fasterxml.jackson.databind.ObjectMapper().readValue(json, new com.fasterxml.jackson.core.type.TypeReference<java.util.Map<java.lang.String, java.lang.Object>>() {    });
    response.getWriter().write(new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(grantsService.getGrants(parameters)));
}