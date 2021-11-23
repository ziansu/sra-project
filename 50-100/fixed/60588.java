public java.lang.Boolean isType(final java.lang.String type) {
    if (((this.imageReferenceType) == null) && (type.equals("reference"))) {
        return true;
    }
    return (type != null) && (type.equalsIgnoreCase(this.imageReferenceType));
}