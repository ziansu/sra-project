@java.lang.Override
public boolean contains(java.lang.Object o) {
    T t = ((T) (o));
    return t.equals(getAny(t).a);
}