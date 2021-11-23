public java.awt.Point getCorner(java.lang.String message) {
    java.lang.System.err.println(message);
    while (!(mouseClick)) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
        }
    } 
    mouseClick = false;
    java.lang.System.err.println(coords);
    return coords;
}