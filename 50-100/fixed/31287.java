public static org.pac4j.core.io.Resource getResource(final java.lang.String filePath) {
    return new org.pac4j.core.io.Resource() {
        @java.lang.Override
        public java.io.InputStream getInputStream() throws java.io.IOException {
            return org.pac4j.core.util.CommonHelper.getInputStreamFromName(filePath);
        }

        @java.lang.Override
        public java.lang.String getFilename() {
            throw new java.lang.UnsupportedOperationException("not implemented");
        }

        @java.lang.Override
        public boolean exists() {
            throw new java.lang.UnsupportedOperationException("not implemented");
        }
    };
}