@java.lang.Override
public int compareTo(ch.redmonkeyass.zombieInvasion.worldmap.Node other) {
    ch.redmonkeyass.zombieInvasion.worldmap.Node o = ((ch.redmonkeyass.zombieInvasion.worldmap.Node) (other));
    float f = (heuristic) + (cost);
    float of = (o.heuristic) + (o.cost);
    if (f < of) {
        return -1;
    }else
        if (f > of) {
            return 1;
        }else {
            return 0;
        }
    
}