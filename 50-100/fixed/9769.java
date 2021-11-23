@org.junit.Test
public void testGetUsers() throws java.lang.Exception {
    com.cmartin.learn.mybank.api.UserFilter userFilter = this.filterManger.buildUserFilter();
    org.mockito.Mockito.when(this.bankApi.getUsers(org.mockito.Matchers.any(com.cmartin.learn.mybank.api.UserFilter.class))).thenReturn(com.cmartin.learn.mybank.test.TestUtils.createUsers(2));
    this.mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/users")).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print()).andExpect(com.cmartin.learn.mybank.web.WebTest.statusOk);
}