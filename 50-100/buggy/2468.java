private ca.nrc.cadc.vos.client.ClientRecursiveSetNode setNodeRecursiveSecure(final ca.nrc.cadc.beacon.web.resources.Node newNode) throws java.io.IOException {
    try {
        return javax.security.auth.Subject.doAs(generateVOSpaceUser(), new java.security.PrivilegedExceptionAction<ca.nrc.cadc.vos.client.ClientRecursiveSetNode>() {
            @java.lang.Override
            public ca.nrc.cadc.vos.client.ClientRecursiveSetNode run() throws java.lang.Exception {
                final ca.nrc.cadc.vos.client.ClientRecursiveSetNode rj = voSpaceClient.setNodeRecursive(newNode);
                rj.setMonitor(false);
                rj.run();
                return rj;
            }
        });
    } catch (java.security.PrivilegedActionException pae) {
        throw new java.io.IOException(pae.getException());
    }
}