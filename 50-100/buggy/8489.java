private <Tab extends nz.ac.auckland.linsolve.Variable> boolean mergeLine(java.util.List<nz.ac.auckland.alm.EmptySpace> line, nz.ac.auckland.alm.algebra.IDirection direction) {
    while ((line.size()) > 1) {
        nz.ac.auckland.alm.EmptySpace area1 = line.get(0);
        nz.ac.auckland.alm.EmptySpace area2 = line.get(1);
        if (!(merge(area1, area2, direction)))
            return false;
        
        line.remove(area2);
    } 
    return true;
}