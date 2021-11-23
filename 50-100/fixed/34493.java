public com.extensions.linq.Q<T> Where(com.extensions.linq.QCompare compare) throws java.lang.IllegalArgumentException {
    if (isNull(compare)) {
        throw new java.lang.IllegalArgumentException("'compare' argument must not be null.");
    }
    java.util.ArrayList<T> result = new java.util.ArrayList<>();
    for (T o : list) {
        if (compare.Is(o)) {
            result.add(o);
        }
    }
    list = result;
    return this;
}