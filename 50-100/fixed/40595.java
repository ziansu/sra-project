@java.lang.Override
public double dot(aljebra.data.IVector that) {
    assert (size) == (that.size());
    double result = 0.0;
    for (int i : ids) {
        result += (get(i)) * (that.get(i));
    }
    return result;
}