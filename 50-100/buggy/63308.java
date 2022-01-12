public com.teamdev.Fraction normalize() {
    if ((n) == 0)
        d = 1;
    else
        for (int i = 0; i < 20; ++i) {
            long x = common_divider(n, d);
            if (x == 1)
                break;
            
            n /= x;
            d /= x;
        }
    
    return this;
}