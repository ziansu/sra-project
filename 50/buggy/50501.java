@com.drew.lang.annotations.Nullable
public java.lang.String getImageTypeDescription() {
    java.lang.Integer type = _directory.getInteger(IcoDirectory.TAG_IMAGE_TYPE);
    if (type == null)
        return null;
    
    return getIndexedDescription(type, 1, "Icon", "Cursor");
}