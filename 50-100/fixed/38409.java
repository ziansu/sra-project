@java.lang.Override
public void start() throws org.eclipse.scout.rt.platform.PlatformException {
    try {
        javax.security.auth.Subject.doAs(m_subject, new java.security.PrivilegedExceptionAction<java.lang.Object>() {
            @java.lang.Override
            public java.lang.Object run() throws java.lang.Exception {
                startSecure();
                return null;
            }
        });
    } catch (java.lang.Exception e) {
        throw new org.eclipse.scout.rt.platform.PlatformException("Unable to start application.", e);
    }
}