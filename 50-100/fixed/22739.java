public void setTriangles(char[] triangles) {
    if (((mIndices) == null) && (triangles != null)) {
        mIndices = new org.gearvrf.GVRIndexBuffer(getGVRContext(), 2, triangles.length);
        org.gearvrf.NativeMesh.setIndexBuffer(getNative(), mIndices.getNative());
    }
    mIndices.setShortVec(triangles);
}