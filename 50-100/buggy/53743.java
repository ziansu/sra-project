public static int getNextPow2TwinPrime(int m) {
    int pos = java.util.Arrays.binarySearch(jsat.utils.ClosedHashingUtil.twinPrimesP2, (m + 1));
    if (pos > 0)
        return jsat.utils.ClosedHashingUtil.twinPrimesP2[pos];
    else
        return jsat.utils.ClosedHashingUtil.twinPrimesP2[((-pos) - 1)];
    
}