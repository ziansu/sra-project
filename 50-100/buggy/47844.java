public boolean attach(mymiddleware.MetaAgent agentIn) {
    if ((routingTable.get(agentIn.getName())) == null) {
        java.lang.System.out.println(((((agentIn.getName()) + " is not in ") + (this.getName())) + " and is being added."));
        routingTable.put(agentIn.getName(), agentIn);
        getUpdater().registerAgent(agentIn, this);
        return true;
    }
    return false;
}