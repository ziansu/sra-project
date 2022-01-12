public double triangle(double x) {
    if (x <= 0.5)
        return 2.0 * x;
    
    if ((x > 0.5) && (x <= 1.5))
        return ((-x) + 1.0) * 2.0;
    
    if (x > 1.5)
        return (x - 2.0) * 2.0;
    
    return 0.0;
}