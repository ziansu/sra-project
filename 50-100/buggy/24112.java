@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public boolean evaluate(java.lang.Object... objects) {
    assert (objects != null) && ((objects.length) == 1);
    java.lang.Object o1 = objects[0];
    assert o1 != null;
    if (o1 instanceof java.lang.Comparable) {
        java.lang.Comparable compObj1 = ((java.lang.Comparable) (o1));
        return (compObj1.compareTo(o1)) == 0;
    }
    return true;
}