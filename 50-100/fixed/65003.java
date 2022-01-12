@org.junit.Test
public void testGetHerokuJson() {
    com.acuo.margin.json.dummy.HerokuJson json = dashboardService.getHerokuJson("999");
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        log.info(mapper.writeValueAsString(json));
    } catch (java.lang.Exception e) {
        log.error("error in testGetHerokuJson", e);
    }
}