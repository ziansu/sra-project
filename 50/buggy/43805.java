@org.junit.Test
public void testEqualPorts_actualToNullAndSameActualDefaults() {
    org.junit.Assert.assertTrue(com.google.cloud.tools.eclipse.appengine.localserver.server.LocalAppEngineServerLaunchConfigurationDelegate.equalPorts(1, null, 8080));
}