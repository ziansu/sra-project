@org.junit.Test
public void send_packet() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/rest/packets").content(createJsonPacket()).contentType(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isCreated());
}