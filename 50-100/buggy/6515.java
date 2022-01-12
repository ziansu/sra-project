@java.lang.Override
protected void stopComponentDelegate() throws java.lang.Exception {
    for (java.util.Set<org.inaetics.remote.admin.wiring.ExportedEndpointImpl> exportedEndpoints : m_exportedEndpoints.values()) {
        for (org.inaetics.remote.admin.wiring.ExportedEndpointImpl exportedEndpoint : exportedEndpoints) {
            exportedEndpoint.close();
        }
    }
    for (java.util.Set<org.inaetics.remote.admin.wiring.ImportedEndpointImpl> importedEndpoints : m_importedEndpoints.values()) {
        for (org.inaetics.remote.admin.wiring.ImportedEndpointImpl importedEndpoint : importedEndpoints) {
            importedEndpoint.close();
        }
    }
    assert m_exportedEndpoints.isEmpty();
    assert m_importedEndpoints.isEmpty();
}