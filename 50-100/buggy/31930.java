public java.awt.Point getClickPoint(java.lang.String message) {
    java.lang.System.out.println(message);
    while (!(mouseClick)) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
        }
    } 
    mouseClick = false;
    initCents[count] = coords;
    (count)++;
    Vision.logger.debug(coords.toString());
    return coords;
}