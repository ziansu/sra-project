int getUP(int n) {
    if ((n < 1) || (n > 8))
        return CENTER;
    
    int temp = (((row) - n) * 8) + (col);
    if ((temp < 0) || ((temp % 8) != (col)))
        return CENTER;
    
    return temp;
}