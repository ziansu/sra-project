@org.testng.annotations.BeforeClass
public void setUp() throws java.lang.Exception {
    mockedService = org.mockito.Mockito.mock(com.myprojects.todo.service.TodoService.class);
    com.myprojects.todo.controller.TodoController todoController = new com.myprojects.todo.controller.TodoController();
    todoController.setTodoService(mockedService);
    mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup(todoController).setControllerAdvice(new com.myprojects.todo.controller.ExceptionHandlerAdvice()).build();
}