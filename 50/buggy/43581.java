@us.kbase.common.service.JsonServerMethod(rpc = "KBaseGeneFamilies.construct_domain_clusters")
public java.lang.String constructDomainClusters(us.kbase.kbasegenefamilies.ConstructDomainClustersParams params, us.kbase.auth.AuthToken authPart) throws java.lang.Exception {
    java.lang.String returnVal = null;
    us.kbase.kbasegenefamilies.KBaseGeneFamiliesServer.getTaskQueue().addTask(params, authPart.toString());
    return returnVal;
}