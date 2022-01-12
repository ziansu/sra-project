private int GeneralHeading(com.fuzzy.simulator.CAnimat animat) {
    java.awt.Point target = new java.awt.Point(0, 0);
    int numAnimats = 0;
    for (com.fuzzy.simulator.CAnimat otherAnimat : _animats) {
        java.awt.Point otherLocation = ClosetLocation(animat.GetLocation(), otherAnimat.GetLocation());
        int animatDistance = animat.GetDistance(otherAnimat);
    }
    return numAnimats;
}