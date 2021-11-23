private int numberOverlaps(java.awt.Rectangle a) {
    int count = 0;
    for (int j = 0; (j < (butArr.length)) && ((butArr[j]) != null); j++) {
        java.awt.Rectangle b = butArr[j].getBounds();
        if (overlap(a, b))
            count++;
        
    }
    return count;
}