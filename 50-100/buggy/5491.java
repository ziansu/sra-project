@org.junit.Test
public void testCreateClientWithEmptyName() {
    try {
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/clients").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsBytes(new com.bah.web.to.CreateClientRequest("")))).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isBadRequest());
    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
        com.bah.web.controller.ClientControllerTest.logger.error("Error happened in the ClientControllerTest class");
        e.printStackTrace();
    } catch (java.lang.Exception e) {
        com.bah.web.controller.ClientControllerTest.logger.error("Error happened in the ClientControllerTest class");
        e.printStackTrace();
    }
}