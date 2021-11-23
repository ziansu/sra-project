private java.util.Collection<org.hip.vif.admin.admin.print.GroupExtent> getAllGroups() throws java.lang.Exception {
    final java.util.Collection<org.hip.vif.admin.admin.print.GroupExtent> outGroups = new java.util.Vector<org.hip.vif.admin.admin.print.GroupExtent>();
    final org.hip.kernel.bom.QueryResult lGroups = org.hip.vif.web.bom.VifBOMHelper.getGroupHome().selectForAdministration(getActor().getActorID(), createOrder());
    while (lGroups.hasMoreElements()) {
        outGroups.add(new org.hip.vif.admin.admin.print.GroupExtent(org.hip.vif.web.util.BeanWrapperHelper.getLong(GroupHome.KEY_ID, lGroups.next())));
    } 
    return outGroups;
}