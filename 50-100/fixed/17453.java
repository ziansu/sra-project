void scheduleMusts(int maxDistance, int[][] distances) {
    must.add(depot.location);
    case2.Tour t = cheapestInsertion(convexHullFinder(must), must, distances);
    t.cycle(depot.location.id);
    new case2.Scatterplot(must, t);
}