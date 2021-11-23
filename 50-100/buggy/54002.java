public void sendCoalition(ro.ieat.soso.core.coalitions.Coalition c, long time) {
    if ((c.getCurrentETA()) == 0L) {
        c.setCurrentETA(time);
    }
    if ((c.getId()) == 0)
        c.setId(((ro.ieat.soso.reasoning.CoalitionReasoner.c_id)++));
    
    coalitionClient.sendCoalition(c);
}