private int distance(java.awt.Color[] colors, int a, int b) {
    if (a == b)
        return 0;
    else
        if (a > b)
            return distance(colors, b, a);
        
    
    return 0;
}