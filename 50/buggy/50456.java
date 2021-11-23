@org.junit.Test
public void testActivatorEnablesServiceProxy() throws java.lang.Exception {
    new org.opendaylight.aaa.shiroact.Activator().init(null, null);
    assertTrue(org.opendaylight.aaa.shiro.ServiceProxy.getInstance().getEnabled(null));
}