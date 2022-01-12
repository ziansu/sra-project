public void setValue(float v) {
    if (v < 0)
        v = 0;
    else
        if (v > 1)
            v = 1;
        
    
    float newy = v * ((getHeight()) - (h.getHeight()));
    float y = (-newy) + (getY());
    h.setPosition(h.getX(), ((getY()) + (-y)));
}