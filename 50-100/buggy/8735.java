@java.lang.Override
public int compareTo(@com.sun.istack.internal.NotNull
java.lang.Object other) {
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