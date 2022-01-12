@java.lang.Override
protected void doRemovePolicyGroup(java.lang.String org, java.lang.String group) {
    try {
        for (io.scepta.model.Policy p : doGetPolicies(org, group, io.scepta.design.server.cassandra.MASTER_TAG)) {
            doRemovePolicy(org, group, p.getName());
        }
        _session.execute(new com.datastax.driver.core.BoundStatement(_removePolicyGroup).bind(org, group, io.scepta.design.server.cassandra.MASTER_TAG));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}