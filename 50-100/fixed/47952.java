@java.lang.Override
public void close() throws org.protempa.BackendCloseException {
    boolean annotationMappingsClosed = false;
    try {
        super.close();
        this.annotationMappings.close();
        annotationMappingsClosed = true;
    } catch (java.io.IOException ex) {
        throw new org.protempa.BackendCloseException(ex);
    } finally {
        if (!annotationMappingsClosed) {
            try {
                this.annotationMappings.close();
            } catch (java.io.IOException ignore) {
            }
        }
    }
}