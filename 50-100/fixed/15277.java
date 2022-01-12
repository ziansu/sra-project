@org.junit.Test
public void setAndGet() {
    javax.ws.rs.core.Response response = getThing();
    javax.ws.rs.core.NewCookie sessionCookie = response.getCookies().get("testapp-session");
    org.junit.Assert.assertEquals("", response.readEntity(java.lang.String.class));
    java.lang.String sessionThing = "My session thing!";
    postThingyToSession(sessionThing, sessionCookie);
    org.junit.Assert.assertEquals(sessionThing, getThing(sessionCookie).readEntity(java.lang.String.class));
}