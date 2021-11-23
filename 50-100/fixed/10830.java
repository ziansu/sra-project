protected long getNumberRecursion(long n) {
    int sum = 0;
    if (n == 0)
        return 1;
    else
        if (n == 1)
            return 0;
        else
            if (n == 2)
                return 1;
            
        
    
    for (int k = 1; k <= n; k++) {
        sum += (sequenceGeneratorA008472.getNumber(k)) * (getNumberRecursion((n - k)));
    }
    return sum / n;
}