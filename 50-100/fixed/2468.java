private void setNodeRecursiveSecure(final ca.nrc.cadc.beacon.web.resources.Node newNode) throws java.io.IOException {
    try {
        javax.security.auth.Subject.doAs(generateVOSpaceUser(), new java.security.PrivilegedExceptionAction<java.lang.Void>() {
            @java.lang.Override
            public java.lang.Void run() throws java.lang.Exception {
                final ca.nrc.cadc.vos.client.ClientRecursiveSetNode rj = voSpaceClient.setNodeRecursive(newNode);
                rj.setMonitor(false);
                rj.run();
                return null;
            }
        });
    } catch (java.security.PrivilegedActionException pae) {
        throw new java.io.IOException(pae.getException());
    }
}