public boolean planRoute(java.awt.geom.Point2D.Double destination) {
    this.route = routePlanner.getRoute(car.getPosition());
    gps.setRoute(this.route);
    if ((this.route) == null) {
        return false;
    }else {
        java.lang.System.out.println(this.route);
        return true;
    }
}