public java.util.Collection<org.ndexbio.model.object.network.Namespace> getNamespaces(java.lang.String networkUUID) {
    java.util.ArrayList<org.ndexbio.model.object.network.Namespace> namespaces = new java.util.ArrayList<>();
    com.orientechnologies.orient.core.record.impl.ODocument networkDoc = getNetworkDocByUUIDString(networkUUID);
    for (com.orientechnologies.orient.core.record.impl.ODocument doc : org.ndexbio.common.models.dao.orientdb.Helper.getNetworkElements(networkDoc, NdexClasses.Network_E_Namespace)) {
        org.ndexbio.model.object.network.Namespace n = getNamespace(doc, null);
        namespaces.add(n);
    }
    return namespaces;
}