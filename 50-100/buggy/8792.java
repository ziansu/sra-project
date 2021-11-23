@org.junit.Test
public void index_showsHomePageTest() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/")).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk()).andExpect(model().attribute("tasks", tasks)).andExpect(model().size(1)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.view().name("index"));
    org.mockito.Mockito.verify(taskService).getAllTasks();
    org.mockito.Mockito.verifyNoMoreInteractions(taskService);
}