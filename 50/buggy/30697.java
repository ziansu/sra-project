private boolean threatening(android.graphics.Point p1, android.graphics.Point p2) {
    if ((!(isSameColour(p1, p2))) && (isBigger(p1, p2)))
        return true;
    
    return false;
}