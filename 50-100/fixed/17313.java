private int numberOverlaps(java.awt.Rectangle a) {
    int count = 0;
    for (int j = 0; (j < (butArr.size())) && ((butArr.get(j)) != null); j++) {
        java.awt.Rectangle b = butArr.get(j).getBounds();
        if (overlap(a, b))
            count++;
        
    }
    return count;
}