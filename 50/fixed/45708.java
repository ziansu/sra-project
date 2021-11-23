@com.ellychou.todo.rest.service.GET
@com.ellychou.todo.rest.service.Path(value = "testRest")
public javax.ws.rs.core.Response getTest() {
    java.lang.String output = "Jersey say : ";
    return javax.ws.rs.core.Response.ok(output).build();
}