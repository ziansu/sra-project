@org.junit.Test
public void test_handleException_relogin() throws java.lang.Throwable {
    portInvoker.handleException(new java.lang.reflect.InvocationTargetException(new java.lang.RuntimeException(org.solenopsis.lasius.util.ExceptionUtil.INVALID_SESSION_ID)), method, session);
    org.mockito.Mockito.verify(sessionMgr, org.mockito.Mockito.times(1)).resetSession(session);
}