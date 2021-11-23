public double chao84() {
    if ((n) == 0)
        return 0;
    
    if ((f[1]) == 0)
        return c;
    
    return (c) + ((((f[0]) * (f[0])) / 2) / (f[1]));
}