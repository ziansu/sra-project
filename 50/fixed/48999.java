@ome.annotations.RolesAllowed(value = "user")
public byte[] getThumbnailDirect(java.lang.Integer sizeX, java.lang.Integer sizeY) {
    byte[] value = retrieveThumbnailDirect(sizeX, sizeY, null, null, true);
    iQuery.clear();
    return value;
}