public static void assertInitialized() {
    synchronized(org.n52.sos.ds.hibernate.H2Configuration.LOCK) {
        if ((org.n52.sos.ds.hibernate.H2Configuration.instance) == null) {
            try {
                org.n52.sos.ds.hibernate.H2Configuration.instance = new org.n52.sos.ds.hibernate.H2Configuration();
            } catch (java.io.IOException | org.n52.sos.ogc.ows.OwsExceptionReport | org.n52.sos.ds.ConnectionProviderException ex) {
                throw new java.lang.RuntimeException(ex);
            }
        }
    }
}