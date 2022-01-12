private static double heuristic(Spot a, Spot b) {
    int x = (b.getI()) - (a.getI());
    int y = (b.getJ()) - (a.getJ());
    return x + y;
}