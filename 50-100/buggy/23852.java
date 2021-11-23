private void findPath() {
    while ((unSettledNodes.size()) > 0) {
        org.educationalProject.surfacePathfinder.Point current = getMinimum(unSettledNodes);
        if (current.equals(destination))
            return ;
        
        settledNodes.add(current);
        unSettledNodes.remove(current);
        findMinimalDistances(current);
    } 
}