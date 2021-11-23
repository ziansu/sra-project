private void handleCarAvailable(CarAgent.CarAgent agent, jade.lang.acl.ACLMessage original) {
    Common.Route route = Common.GoogleApiHelper.DirectionsClient.getDirectionsToTarget(agent, this.clientPosition);
    if (agent.hasEnoughFuelForTrip(route))
        acceptRequest(agent, original, route);
    else {
        rejectRequest(agent, original);
        makeChargeRequest(agent);
    }
}