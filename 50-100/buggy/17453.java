void scheduleMusts(int maxDistance, int[][] distances) {
    must.add(depot.location);
    case2.Tour t = cheapestInsertion(convexHullFinder(must), must, distances);
    t.print();
    t.cycle(depot.location.id);
    java.lang.System.out.println(" ");
    t.print();
    case2.Scatterplot plot = new case2.Scatterplot(must, t);
}