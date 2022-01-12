private void markRemovedAgentsForLaterDelete(java.util.List<com.sos.jitl.reporting.db.DBItemInventoryAgentInstance> actualAgents, java.util.List<com.sos.jitl.reporting.db.DBItemInventoryAgentInstance> dbAgents) throws com.sos.hibernate.exceptions.SOSHibernateException {
    if (!(closed)) {
        agentsToDelete = new java.util.HashSet<com.sos.jitl.reporting.db.DBItemInventoryAgentInstance>();
        for (com.sos.jitl.reporting.db.DBItemInventoryAgentInstance agent : dbAgents) {
            if (!(actualAgents.contains(agent))) {
                agentsToDelete.add(agent);
            }
        }
    }
}