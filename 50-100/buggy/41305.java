@org.testng.annotations.Test
public void testBasicCache() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, javax.servlet.ServletException {
    broadcaster.broadcast("e1").get();
    broadcaster.removeAtmosphereResource(ar);
    broadcaster.broadcast("e2").get();
    broadcaster.broadcast("e3").get();
    org.testng.Assert.assertEquals(broadcasterCache.messages().get(ar.uuid()).getQueue().size(), 2);
}