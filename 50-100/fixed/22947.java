public void addPointAsActive(java.awt.Point xy) {
    int offset = (N) / 2;
    for (int i = (xy.x) - offset; i <= ((xy.x) + offset); i++)
        for (int j = (xy.y) - offset; j <= ((xy.y) + offset); j++)
            active2.add(new java.awt.Point(i, j));
        
    
}