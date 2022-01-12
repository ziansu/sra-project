@java.lang.Override
public double[] toArray() {
    double[] result = new double[size];
    for (int i = 0; i < (count); ++i) {
        result[ids[i]] = get(i);
    }
    return result;
}