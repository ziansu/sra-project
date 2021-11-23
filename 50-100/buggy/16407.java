@org.junit.Test
public void all() {
    when(todoService.getAll()).thenReturn(java.util.Arrays.asList(new springboot.model.Todo(springboot.controller.TodoControllerTest.NAME, springboot.controller.TodoControllerTest.PRIORITY)));
    com.jayway.restassured.RestAssured.given().port(serverPort).contentType("application/json").when().get("/todos").then().body(org.hamcrest.Matchers.containsString("value")).body(org.hamcrest.Matchers.containsString(springboot.controller.TodoControllerTest.NAME)).statusCode(200);
    verify(todoService).getAll();
}