protected java.lang.String unparseArray(T array) {
    java.lang.StringBuilder str = new java.lang.StringBuilder("[");
    java.util.Iterator<T> elements = io.burt.jmespath.BaseRuntime.toList(array).iterator();
    while (elements.hasNext()) {
        str.append(unparse(elements.next()));
        if (elements.hasNext()) {
            str.append(",");
        }
    } 
    str.append("]");
    return str.toString();
}