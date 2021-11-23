@org.junit.Test
public void startServer() throws java.lang.Exception {
    start(new java.lang.String[]{ "--spring.profiles.active=test" }, true);
}