private int bound(int n) {
    n = n % (org.ag.ants_utils.Variables.DIM);
    while (n < 0) {
        n += n;
    } 
    return n;
}