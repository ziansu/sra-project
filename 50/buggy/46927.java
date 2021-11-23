@java.lang.Override
public void evaluate(long value) {
    (count)++;
    sum += value;
    evaluateMinMax(value);
}