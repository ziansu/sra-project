private static java.lang.Double optOverlap(net.bytten.gameutil.algorithms.Vec2D a, net.bytten.gameutil.algorithms.Vec2D b) {
    if ((a.x) <= (b.x)) {
        if ((a.y) > (b.x)) {
            return (a.y) - (b.x);
        }
    }else
        if ((a.x) < (b.y)) {
            return (b.y) - (a.x);
        }
    
    return null;
}