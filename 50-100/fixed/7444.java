private void extractAgentGroupAvailability(com.genesys.workspace.models.targets.Target target) {
    com.google.gson.internal.LinkedTreeMap availabilityData = ((com.google.gson.internal.LinkedTreeMap) (target.getAvailability()));
    if (availabilityData == null) {
        return ;
    }
    java.lang.Integer readyAgents = ((java.lang.Double) (availabilityData.get("readyAgents"))).intValue();
    this.availability = new com.genesys.workspace.models.targets.AgentGroupAvailability(readyAgents);
}