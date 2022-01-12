public static java.lang.Double EuclideanDistance(org.cacrowd.casim.pedca.environment.grid.GridPoint gp1, org.cacrowd.casim.pedca.environment.grid.GridPoint gp2) {
    return java.lang.Math.sqrt(((((gp1.getX()) - (gp2.getX())) ^ (2 + ((gp1.getY()) - (gp2.getY())))) ^ 2));
}