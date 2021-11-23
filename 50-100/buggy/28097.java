private boolean hitRoad(pentos.sim.Cell location, pentos.sim.Building b) {
    java.util.Iterator<pentos.sim.Cell> itr = b.iterator();
    while (itr.hasNext()) {
        pentos.sim.Cell c = itr.next();
        pentos.sim.Cell check_cell = new pentos.sim.Cell(((c.i) + (location.i)), ((c.j) + (location.j)));
        if (roads.contains(c))
            return true;
        
    } 
    return false;
}