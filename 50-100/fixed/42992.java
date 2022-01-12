public double getMaxZ() {
    if (!(java.lang.Double.isNaN(zMax)))
        return zMax;
    
    for (int i = 0; i < (getXyz()[0].length); i++) {
        final double z = getXyz(0, i, 2);
        if ((z >= (zMax)) || (java.lang.Double.isNaN(zMax)))
            zMax = z;
        
    }
    return zMax;
}