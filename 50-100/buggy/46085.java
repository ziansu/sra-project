private void enforceRemovedRule(int ruleId) {
    java.util.Set<java.lang.String> flowEntryName = ruleId2FlowName.get(ruleId);
    java.util.Iterator<java.lang.String> iter = flowEntryName.iterator();
    while (iter.hasNext()) {
        java.lang.String name = iter.next();
        removeFlow(name);
        net.floodlightcontroller.accesscontrollist.ACL.logger.info((("ACL flow " + name) + " removed."));
    } 
}