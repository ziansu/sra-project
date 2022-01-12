@org.junit.Test
public void insert() {
    when(todoService.saveTodo(springboot.controller.TodoControllerTest.NAME, springboot.controller.TodoControllerTest.PRIORITY)).thenReturn(true);
    com.jayway.restassured.RestAssured.given().contentType("application/json").port(serverPort).when().body(springboot.controller.TodoControllerTest.TODO).post("/todos").then().body(org.hamcrest.Matchers.containsString("true")).statusCode(200);
    verify(todoService).saveTodo(springboot.controller.TodoControllerTest.NAME, springboot.controller.TodoControllerTest.PRIORITY);
}