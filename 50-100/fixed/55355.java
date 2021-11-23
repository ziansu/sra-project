private double getDistanceToClosestObs(problem.ArmConfig c, robot.HBVNode obs) {
    double d = java.lang.Double.MAX_VALUE;
    java.util.Stack<robot.HBVNode> s = new java.util.Stack<robot.HBVNode>();
    s.push(obs);
    for (java.awt.geom.Line2D l : c.getLinks()) {
        d = DFSDistance(obs, s, d, l);
    }
    return d;
}