public java.lang.String toString(java.lang.Iterable<E> list) {
    java.lang.StringBuffer result = new java.lang.StringBuffer("[");
    int counter = 0;
    for (E element : list) {
        result.append(((++counter) < (size()) ? element + ", " : element));
    }
    return result.append("]").toString();
}