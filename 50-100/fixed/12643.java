@org.junit.Test
public void TestGetProblemTests() {
    javax.ws.rs.core.Response response = test.java.TestDirlididi.server.newRequest((("/problem/" + (test.java.TestDirlididi.PROBLEM_ID)) + "/test")).request().buildGet().invoke();
    org.junit.Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
}