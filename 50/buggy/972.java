@java.lang.Override
protected org.cloudfoundry.client.v2.securitygroups.ListSecurityGroupsRequest getValidRequest() throws java.lang.Exception {
    return org.cloudfoundry.client.v2.securitygroups.ListSecurityGroupsRequest.builder().name("dummy1").page((-1)).build();
}