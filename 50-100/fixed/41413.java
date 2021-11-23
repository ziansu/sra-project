private static double heuristic(Spot a, Spot b) {
    int x = (b.getI()) - (a.getI());
    int y = (b.getJ()) - (a.getJ());
    if (x < 0)
        x = -x;
    
    if (y < 0)
        y = -y;
    
    return x + y;
}