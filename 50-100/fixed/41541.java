public java.awt.Point findLocation(quadcitydjs.Location loc) {
    java.awt.Point p = new java.awt.Point();
    for (int i = 0; i < (getHeight()); i++) {
        for (int j = 0; j < (getWidth()); j++) {
            if ((location[i][j]) == loc) {
                p.x = i;
                p.y = j;
                return p;
            }
        }
    }
    return p;
}