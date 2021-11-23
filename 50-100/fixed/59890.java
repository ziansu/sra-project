public java.util.Collection<org.ndexbio.model.object.network.Namespace> getNamespacesFromNetworkDoc(com.orientechnologies.orient.core.record.impl.ODocument networkDoc) {
    java.util.ArrayList<org.ndexbio.model.object.network.Namespace> namespaces = new java.util.ArrayList<>();
    for (com.orientechnologies.orient.core.record.impl.ODocument doc : org.ndexbio.common.models.dao.orientdb.Helper.getNetworkElements(networkDoc, NdexClasses.Network_E_Namespace)) {
        namespaces.add(getNamespace(doc));
    }
    return namespaces;
}