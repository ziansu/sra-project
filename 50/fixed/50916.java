public void setB(int b) {
    if (b > 255)
        b = 255;
    
    if (b < 0)
        b = 0;
    
    B = b;
}