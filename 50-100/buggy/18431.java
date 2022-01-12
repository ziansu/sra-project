private com.ryanair.apis.models.SolutionResource createAndPushSolution(com.ryanair.apis.utils.DirectFlightEnum direct, com.ryanair.apis.models.Leg firstLeg) {
    com.ryanair.apis.models.SolutionResource solution = new com.ryanair.apis.models.SolutionResource();
    solution.setStops(direct.ordinal());
    java.util.Set<com.ryanair.apis.models.Leg> legs = new java.util.LinkedHashSet<com.ryanair.apis.models.Leg>(((direct.ordinal()) + 1));
    legs.add(firstLeg);
    solution.setLegs(legs);
    return this.solutions.push(solution);
}