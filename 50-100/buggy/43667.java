@java.lang.Override
public double getCalibratedTimePoint(int c, int t, int z) {
    if (singleFrameChannel(c)) {
        if (c > 0)
            c--;
        else
            c++;
        
        if ((imageCT.length) >= c)
            return java.lang.Double.NaN;
        
    }
    return imageCT[c][t].imageSources.getCalibratedTimePoint(t, c, z);
}