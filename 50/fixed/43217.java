private void setStateTimeOnFlex(org.opentripplanner.routing.edgetype.State s0, org.opentripplanner.routing.edgetype.StateEditor s1, org.opentripplanner.routing.edgetype.RoutingRequest options) {
    setStateTimeOnFlex(s0, s1, options, s0.getCurrentHop(), s0.getTripTimes(), s0.getServiceDay());
}