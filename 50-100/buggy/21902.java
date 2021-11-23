public static int pow(int base, int exp) {
    if (exp == 0)
        return 1;
    
    if (exp == 1)
        return base;
    
    if (exp == 2)
        return base * base;
    
    if (exp == 3)
        return (base * base) * base;
    
    int result = 1;
    while (exp) {
        if (exp & 1)
            result *= base;
        
        exp >>= 1;
        base *= base;
    } 
    return result;
}