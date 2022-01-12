public void run() {
    org.testng.Assert.assertNotNull(server);
    org.testng.Assert.assertTrue(server.getAttribute(Startable.SERVICE_UP));
    org.testng.Assert.assertTrue(server.getAttribute(OpenShiftWebApp.SERVICE_PROCESS_IS_RUNNING));
}