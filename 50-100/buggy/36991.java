public long sum(int from, int to) {
    if (from > 0)
        return (sum(0, to)) - (sum(0, from));
    
    long res = 0;
    for (int i = to; i >= 0; i = (i & (i + 1)) - 1)
        res += s[i];
    
    return res;
}