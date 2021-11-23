@java.lang.Override
public void onAuthenticationFailure(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.AuthenticationException authException) throws java.io.IOException, javax.servlet.ServletException {
    org.owasp.appsensor.core.event.EventManager eventManager = client.getEventManager();
    org.owasp.appsensor.core.User user = extractUser();
    org.owasp.appsensor.core.DetectionSystem detectionSystem = new org.owasp.appsensor.core.DetectionSystem("Acme petstore");
    org.owasp.appsensor.core.DetectionPoint detectionPoint = new org.owasp.appsensor.core.DetectionPoint("Authentication", "AE2");
    org.owasp.appsensor.core.Event event = new org.owasp.appsensor.core.Event(user, detectionPoint, detectionSystem);
    eventManager.addEvent(event);
}