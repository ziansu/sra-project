public squidpony.squidmath.GreasedRegion disperseRandom(squidpony.squidmath.RNG random) {
    if (((width) < 1) || ((ySections) <= 0))
        return this;
    
    int len = data.length;
    for (int j = 0; j < len; j++) {
        data[j] &= random.randomInterleave();
    }
    return this;
}