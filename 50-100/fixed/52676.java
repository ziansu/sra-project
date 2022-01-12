private java.util.List<java.util.List<no.emagnus.tsp.data.TspDataPoint>> assignFitnessToRoutes(java.util.Collection<no.emagnus.ga.Individual> population) {
    java.util.List<java.util.List<no.emagnus.tsp.data.TspDataPoint>> routes = new java.util.ArrayList<>();
    for (no.emagnus.ga.Individual individual : population) {
        java.util.List<no.emagnus.tsp.data.TspDataPoint> route = createRouteFromGenotype(individual.getGenotype());
        routes.add(route);
    }
    return routes;
}