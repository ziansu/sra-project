void createNode(final ca.nrc.cadc.beacon.web.resources.Node newNode) throws java.lang.Exception {
    executeSecurely(new java.security.PrivilegedExceptionAction<java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void run() throws java.lang.Exception {
            voSpaceClient.createNode(newNode, false);
            return null;
        }
    });
}