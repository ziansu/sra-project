protected void put(java.lang.String name, org.apache.drill.exec.vector.ValueVector vv) {
    int ordinal = vectors.size();
    if ((vectors.put(name, vv)) != null) {
        throw new java.lang.IllegalStateException();
    }
    vectorIds.put(name.toLowerCase(), new org.apache.drill.exec.vector.complex.VectorWithOrdinal(vv, ordinal));
    vectorsById.put(ordinal, vv);
    field.addChild(vv.getField());
}