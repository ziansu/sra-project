public static synchronized void init() throws java.io.IOException, java.lang.IllegalStateException, org.asteriskjava.manager.AuthenticationFailedException, org.asteriskjava.manager.TimeoutException {
    if ((org.asteriskjava.pbx.internal.core.CoherentManagerConnection.self) != null)
        org.asteriskjava.pbx.internal.core.CoherentManagerConnection.logger.warn("The CoherentManagerConnection has already been initialised");
    else {
        org.asteriskjava.pbx.internal.core.CoherentManagerConnection.self = new org.asteriskjava.pbx.internal.core.CoherentManagerConnection();
        org.asteriskjava.pbx.internal.core.CoherentManagerConnection.self.checkFeatures();
    }
    org.asteriskjava.pbx.internal.core.CoherentManagerConnection.self.checkConnection();
}