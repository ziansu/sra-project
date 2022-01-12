@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void testSavePolicy() throws java.lang.Exception {
    mock().perform(post("/travel/policy").contentType(MediaType.APPLICATION_JSON).content(createValidTravel())).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isCreated()).andReturn();
}