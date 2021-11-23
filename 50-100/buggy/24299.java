java.util.List<java.lang.String> getMembers() throws java.lang.Exception {
    java.util.List<java.lang.String> members = null;
    if ((RTBServer.node) != null)
        RTBServer.node.getMembers();
    else {
        members = new java.util.ArrayList();
        members.add(com.xrtb.common.Configuration.getInstance().instanceName);
    }
    return members;
}