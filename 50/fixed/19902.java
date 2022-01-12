public void setR(int r) {
    if (r > 255)
        r = 255;
    
    if (r < 0)
        r = 0;
    
    R = r;
}