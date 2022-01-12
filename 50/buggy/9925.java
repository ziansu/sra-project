@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    if (value != null) {
        long x = value.longValue();
        (count)++;
        sum += x;
        evaluateMinMax(x);
    }
}