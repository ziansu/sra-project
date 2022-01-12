@java.lang.Override
public java.lang.Object[] toArray() {
    java.lang.Object[] result = new java.lang.Object[size()];
    base.toArray(result);
    int i = base.size();
    for (E element : extension) {
        result[(i++)] = element;
    }
    return result;
}