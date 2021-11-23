@java.lang.Override
public int getPoints() {
    int points = 1;
    for (java.util.Iterator<entities.Square> i = getSquaresInvolved().iterator(); i.hasNext();) {
        entities.Block b = i.next().getBlock();
        if (b != null)
            points *= b.getMultiplier();
        
    }
    return points;
}