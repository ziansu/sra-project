@java.lang.Override
public java.util.Map<java.lang.Object, java.lang.Double> classDistribution(net.sf.javaml.core.Instance inst) {
    double min = java.lang.Double.POSITIVE_INFINITY;
    net.sf.javaml.distance.EuclideanDistance ed = new net.sf.javaml.distance.EuclideanDistance();
    int index = 0;
    for (int i = 0; i < (centroids.length); i++) {
        double d = ed.measure(centroids[i], inst);
        if (d < min) {
            min = d;
            index = i;
        }
    }
    return distribution.get(index);
}