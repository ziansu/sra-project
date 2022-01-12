public double getMinZ() {
    if (!(java.lang.Double.isNaN(zMin)))
        return zMin;
    
    for (int i = 0; i < (getXyz()[0].length); i++) {
        final double z = getXyz(0, i, 2);
        if (z <= (zMin))
            zMin = z;
        
    }
    return zMin;
}