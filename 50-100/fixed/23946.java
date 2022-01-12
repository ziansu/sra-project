@java.lang.Override
public org.apache.zeppelin.resource.ResourceSet getAllResources() {
    try {
        java.util.List<java.lang.String> resourceList = client.resourcePoolGetAll();
        resources = new org.apache.zeppelin.resource.ResourceSet();
        com.google.gson.Gson gson = new com.google.gson.Gson();
        for (java.lang.String res : resourceList) {
            org.apache.zeppelin.resource.RemoteResource r = gson.fromJson(res, org.apache.zeppelin.resource.RemoteResource.class);
            r.setResourcePoolConnector(this);
            resources.add(r);
        }
        return resources;
    } catch (org.apache.thrift.TException e) {
        throw new java.lang.RuntimeException(e);
    }
}