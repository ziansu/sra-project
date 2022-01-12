@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/asPropertyGraph")
@javax.ws.rs.Produces(value = "application/json")
@org.ndexbio.rest.annotations.ApiDoc(value = "Creates a new network based on a POSTed NetworkPropertyGraph object. This method errors if the " + (("NetworkPropertyGraph object is not provided or if it does not specify a name. It also errors if the " + "NetworkPropertyGraph object is larger than a maximum size for network creation set in the NDEx server ") + "configuration. A NetworkSummary object for the new network is returned."))
public org.ndexbio.model.object.network.NetworkSummary createNetwork(final org.ndexbio.model.object.network.PropertyGraphNetwork newNetwork) throws java.lang.Exception {
    com.google.common.base.Preconditions.checkArgument((null != newNetwork), "A network is required");
    com.google.common.base.Preconditions.checkArgument((!(com.google.common.base.Strings.isNullOrEmpty(newNetwork.getName()))), "A network name is required");
    org.ndexbio.common.access.NdexDatabase db = org.ndexbio.common.access.NdexDatabase.getInstance();
    org.ndexbio.common.persistence.orientdb.PropertyGraphLoader pgl = null;
    try {
        pgl = new org.ndexbio.common.persistence.orientdb.PropertyGraphLoader(db);
        return pgl.insertNetwork(newNetwork, getLoggedInUser().getAccountName());
    } finally {
        db.close();
    }
}