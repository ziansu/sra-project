public void setValue(float v) {
    if (v < 0)
        v = 0;
    else
        if (v > 1)
            v = 1;
        
    
    float newy = (getY()) + (v * ((getHeight()) - (h.getHeight())));
    h.setPosition(h.getX(), newy);
}