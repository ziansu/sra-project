@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public org.springframework.test.web.servlet.MvcResult testSavePolicy() throws java.lang.Exception {
    org.springframework.test.web.servlet.MvcResult result = mock().perform(post("/travel/policy").contentType(MediaType.APPLICATION_JSON).content(createValidTravel())).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isCreated()).andReturn();
    return result;
}