private void wrapAroundPoint(java.awt.Point temp) {
    if ((temp.x) < 0)
        temp.x += GameWidth;
    
    if ((temp.y) < 0)
        temp.y += GameHeight;
    
    if ((temp.x) > (GameWidth))
        temp.x -= GameWidth;
    
    if ((temp.y) > (GameHeight))
        temp.y -= GameHeight;
    
}