public E get(int index) {
    rangeCheck(index);
    traceCall("get", new java.lang.String[]{ java.lang.Integer.toString(index) }, 1, java.lang.Math.min(index, ((size) - index)));
    return elementData(index);
}