@org.junit.Test
public void TEstGetProblemWithId() {
    javax.ws.rs.core.Response response = test.java.TestDirlididi.server.newRequest(("/problem/" + (test.java.TestDirlididi.PROBLEM_ID))).request().buildGet().invoke();
    org.junit.Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
}