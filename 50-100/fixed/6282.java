private void addUV(java.lang.String su, java.lang.String sv) {
    java.lang.Float u = fromString(su);
    java.lang.Float v = fromString(sv);
    if ((u != null) && (v != null)) {
        mUVs.add(u);
        mUVs.add(v);
    }
}