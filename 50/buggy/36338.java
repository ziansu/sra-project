@org.junit.Test
public void testUnregisterApplicationNotFound() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete("/apps/processor/blubba").accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNotFound());
}