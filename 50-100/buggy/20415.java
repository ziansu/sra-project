public static void TestPostSolutionToProblem() {
    javax.ws.rs.client.Entity<java.lang.String> someEntity = javax.ws.rs.client.Entity.entity("solutionString, user", MediaType.APPLICATION_JSON);
    javax.ws.rs.core.Response response = test.java.TestDirlididi.server.newRequest((("/problem/" + (test.java.TestDirlididi.PROBLEM_ID)) + "/solution")).request().buildPost(someEntity).invoke();
    org.junit.Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
}