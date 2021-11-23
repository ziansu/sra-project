public void performAllSearches() {
    for (int i = 0; i < (pathPoints.size()); i++) {
        com.gridworld.algorithm.Search search = new com.gridworld.algorithm.Search();
        try {
            java.util.ArrayList<com.gridworld.grid.GridSquare> paths = search.performSearch(this, i);
            pathPoints.get(i).path = paths;
        } catch (com.gridworld.exceptions.TraversalException e) {
            e.printStackTrace();
        }
    }
}