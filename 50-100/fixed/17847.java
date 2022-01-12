public static java.lang.Double EuclideanDistance(org.cacrowd.casim.pedca.environment.grid.GridPoint gp1, org.cacrowd.casim.pedca.environment.grid.GridPoint gp2) {
    return java.lang.Math.sqrt(((((gp1.getX()) - (gp2.getX())) * ((gp1.getX()) - (gp2.getX()))) + (((gp1.getY()) - (gp2.getY())) * ((gp1.getY()) - (gp2.getY())))));
}