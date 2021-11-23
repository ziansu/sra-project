@ome.annotations.RolesAllowed(value = "user")
public byte[] getThumbnailByLongestSideDirect(java.lang.Integer size) {
    errorIfNullPixelsAndRenderingDef();
    byte[] value = _getThumbnailByLongestSideDirect(size, null, null);
    iQuery.clear();
    return value;
}