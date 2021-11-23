@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    if (value != null) {
        evaluateMinMax(value);
        (count)++;
        sum = sum.add(value);
    }
}