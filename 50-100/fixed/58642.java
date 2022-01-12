public void setTriangles(int[] triangles) {
    if (((mIndices) == null) && (triangles != null)) {
        mIndices = new org.gearvrf.GVRIndexBuffer(getGVRContext(), 4, triangles.length);
        org.gearvrf.NativeMesh.setIndexBuffer(getNative(), mIndices.getNative());
    }
    mIndices.setIntVec(triangles);
}