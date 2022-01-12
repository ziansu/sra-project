@java.lang.Override
public int compareTo(java.lang.Number o) {
    double diff = (value) - (o.doubleValue());
    if ((java.lang.Math.abs(diff)) <= (variance)) {
        return 0;
    }
    return value.compareTo(o.doubleValue());
}