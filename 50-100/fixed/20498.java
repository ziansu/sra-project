@java.lang.Override
public double norm(int n) {
    assert n > 0;
    double result = 0;
    for (int i : ids) {
        result += java.lang.Math.abs(java.lang.Math.pow(get(i), n));
    }
    result = java.lang.Math.pow(result, (1.0 / ((double) (n))));
    return result;
}