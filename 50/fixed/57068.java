public void setA(int a) {
    if (a > 255)
        a = 255;
    
    if (a < 0)
        a = 0;
    
    A = a;
}