public int getMaxY() {
    int minY = 65535;
    int maxY = -65535;
    for (int[][] i1 : hitBox) {
        if (i1 != null)
            for (int[] i2 : i1) {
                if (i2 != null) {
                    if ((i2[0]) < minY) {
                        minY = i2[0];
                    }
                    if ((i2[1]) > maxY) {
                        maxY = i2[1];
                    }
                }
            }
        
    }
    return maxY;
}