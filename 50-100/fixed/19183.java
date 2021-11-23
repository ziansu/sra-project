private java.util.List<no.emagnus.tsp.data.TspDataPoint> createRouteFromGenotype(int[] genotype) {
    java.util.List<no.emagnus.tsp.data.TspDataPoint> route = new java.util.ArrayList<>();
    for (int idx : genotype) {
        route.add(cities.get(idx));
    }
    route.add(cities.get(0));
    return route;
}