@org.junit.Test
public void testProfile() throws java.lang.Exception {
    com.jimmy.application.Application.main(new java.lang.String[]{ "--spring.profiles.active=staging" });
    this.outputCapture.expect(org.hamcrest.Matchers.containsString("Sample Debug Message"));
    this.outputCapture.expect(org.hamcrest.Matchers.containsString("Sample Trace Message"));
}