public static void setJunctionDepth(Vertex v) {
    Tuple<java.lang.Double, java.lang.Double> newDepth = SystemSetup.findJunctionDepth(SystemSetup.junctions.get(v.getId()), SystemSetup.junctions.get(v.getId()));
    SystemSetup.junctions.get(v.getId()).setLeftDepth(newDepth.x);
    SystemSetup.junctions.get(v.getId()).setRightDepth(newDepth.y);
}