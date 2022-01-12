private boolean isPrime(int p) {
    if (p == 2)
        return true;
    
    if (p < 3)
        return false;
    
    if ((p % 2) == 0)
        return false;
    
    for (int i = 3; (i * i) < p; i += 2)
        if ((p % i) == 0)
            return false;
        
    
    return true;
}