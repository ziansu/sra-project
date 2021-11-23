@java.lang.Override
public double cdf(int x) {
    if (x >= (trials))
        return 1;
    
    if (x < 0)
        return 0;
    
    return betaIncReg((1 - (p)), ((trials) - x), (1 + x));
}