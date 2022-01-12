public void wiringSenderRemoved(java.lang.String wireId) {
    java.util.Collection<java.util.Set<org.inaetics.remote.admin.wiring.ImportedEndpointImpl>> endpointSets = m_importedEndpoints.values();
    for (java.util.Set<org.inaetics.remote.admin.wiring.ImportedEndpointImpl> endpointSet : endpointSets) {
        for (org.inaetics.remote.admin.wiring.ImportedEndpointImpl endpoint : endpointSet) {
            java.lang.String endpointWireId = ((java.lang.String) (endpoint.getImportedEndpoint().getProperties().get(WiringAdminConstants.WIRE_ID)));
            if (endpointWireId.equals(wireId)) {
                endpoint.close();
            }
        }
    }
}