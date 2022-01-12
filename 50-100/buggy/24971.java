public void pop(java.util.List<E> elements, java.util.List<java.lang.Integer> poppedIndices, java.util.List<java.lang.Integer> temp) {
    indexPool.pop(temp, temp.size());
    for (java.lang.Integer i : temp)
        delegate.set(i, null);
    
    poppedIndices.addAll(poppedIndices);
}