public double[] getMinMaxAccelY() {
    double minY = java.lang.Double.MAX_VALUE;
    double maxY = java.lang.Double.MIN_VALUE;
    for (org.smcnus.irace_gaittester.Models.SensorInstance accel : accels) {
        if ((accel.getDataY()) < minY)
            minY = accel.getDataY();
        
        if ((accel.getDataY()) > maxY)
            maxY = accel.getDataY();
        
    }
    return new double[]{ minY , maxY };
}