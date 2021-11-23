@ome.annotations.RolesAllowed(value = "user")
public byte[] getThumbnailForSectionDirect(int theZ, int theT, java.lang.Integer sizeX, java.lang.Integer sizeY) {
    byte[] value = retrieveThumbnailDirect(sizeX, sizeY, theZ, theT);
    iQuery.clear();
    return value;
}