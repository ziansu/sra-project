private org.ndexbio.model.object.network.Namespace getNamespace(com.orientechnologies.orient.core.record.impl.ODocument ns, org.ndexbio.model.object.network.Network network) {
    org.ndexbio.model.object.network.Namespace rns = new org.ndexbio.model.object.network.Namespace();
    rns.setId(((long) (ns.field("id"))));
    rns.setPrefix(((java.lang.String) (ns.field(NdexClasses.ns_P_prefix))));
    rns.setUri(((java.lang.String) (ns.field(NdexClasses.ns_P_uri))));
    org.ndexbio.common.models.dao.orientdb.SingleNetworkDAO.getPropertiesFromDoc(ns, rns);
    return rns;
}