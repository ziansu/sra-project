public static void invert(ij.process.ImageProcessor ip) {
    float[] cTable = ip.getCalibrationTable();
    ip = ip.duplicate();
    if (cTable == null) {
        ip.invert();
    }else {
        float[] invertedCTable = new float[cTable.length];
        for (int i = (cTable.length) - 1; i >= 0; i--)
            invertedCTable[i] = -(cTable[i]);
        
        ip.setCalibrationTable(invertedCTable);
    }
}