private static double siteVacancy(Percolation.PercolationStats ps, int gridSize) {
    return ((java.lang.Math.pow(gridSize, 2)) - (ps.mean())) / ((java.lang.Math.pow(gridSize, 2)) * 100.0);
}