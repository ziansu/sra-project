@java.lang.Override
public int findGCD(int p, int q) {
    if (q == 0) {
        return p;
    }
    return findGCD(q, (p % q));
}