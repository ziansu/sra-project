public void setNetworkProperties(java.util.Collection<org.ndexbio.model.object.NdexPropertyValuePair> properties, java.util.Collection<org.ndexbio.model.object.SimplePropertyValuePair> presentationProperties) {
    if (properties != null) {
        this.network.getProperties().addAll(properties);
        this.networkDoc.field(NdexClasses.ndexProperties, this.network.getProperties()).save();
    }
}