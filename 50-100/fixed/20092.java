@ome.annotations.RolesAllowed(value = "user")
public byte[] getThumbnailForSectionByLongestSideDirect(int theZ, int theT, java.lang.Integer size) {
    errorIfNullPixelsAndRenderingDef();
    iQuery.clear();
    byte[] value = _getThumbnailByLongestSideDirect(size, theZ, theT, true);
    iQuery.clear();
    return value;
}