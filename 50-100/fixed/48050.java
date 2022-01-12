private void extractDNAvailability(com.genesys.workspace.models.targets.Target target) {
    com.google.gson.internal.LinkedTreeMap availabilityData = ((com.google.gson.internal.LinkedTreeMap) (target.getAvailability()));
    if (availabilityData == null) {
        return ;
    }
    java.lang.Integer waitingCalls = ((java.lang.Double) (availabilityData.get("waitingCalls"))).intValue();
    if ((this.type) == (TargetType.ACD_QUEUE)) {
        this.availability = new com.genesys.workspace.models.targets.ACDQueueAvailability(waitingCalls);
    }else {
        this.availability = new com.genesys.workspace.models.targets.RoutePointAvailability(waitingCalls);
    }
}