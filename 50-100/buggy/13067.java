private java.util.ArrayList<java.awt.geom.Point2D.Double> generateTestPath() {
    java.util.ArrayList<java.awt.geom.Point2D.Double> testPath = new java.util.ArrayList<java.awt.geom.Point2D.Double>();
    for (int i = 0; i < 1000; i++) {
        testPath.add(new java.awt.geom.Point2D.Double((i / 500.0), 0.0));
    }
}