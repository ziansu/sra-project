@java.lang.Override
public void evaluate(long value) {
    evaluateMinMax(value);
    (count)++;
    sum += value;
}