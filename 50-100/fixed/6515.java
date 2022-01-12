@java.lang.Override
protected void stopComponentDelegate() throws java.lang.Exception {
    synchronized(m_exportedEndpoints) {
        for (java.util.Set<org.inaetics.remote.admin.wiring.ExportedEndpointImpl> exportedEndpoints : m_exportedEndpoints.values()) {
            for (org.inaetics.remote.admin.wiring.ExportedEndpointImpl exportedEndpoint : exportedEndpoints) {
                exportedEndpoint.close();
            }
        }
    }
    synchronized(m_importedEndpoints) {
        for (java.util.Set<org.inaetics.remote.admin.wiring.ImportedEndpointImpl> importedEndpoints : m_importedEndpoints.values()) {
            for (org.inaetics.remote.admin.wiring.ImportedEndpointImpl importedEndpoint : importedEndpoints) {
                importedEndpoint.close();
            }
        }
    }
}