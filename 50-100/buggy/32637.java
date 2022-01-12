public void calculateDAndEShares(int layer, int wire) {
    da = (circuitValues[(--layer)][wire]) ^ (ua);
    ea = (circuitValues[(--layer)][(wire++)]) ^ (va);
}