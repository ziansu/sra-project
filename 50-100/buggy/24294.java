public E set(int index, E element) {
    rangeCheck(index);
    traceCall("set", new java.lang.String[]{ java.lang.Integer.toString(index) , "Object" }, 1, java.lang.Math.min(index, ((size) - index)));
    E oldValue = elementData(index);
    elementData[index] = element;
    return oldValue;
}