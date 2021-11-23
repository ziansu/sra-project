private void expandType(java.lang.String type) {
    if ((getRelatingObject().getType()) != null) {
        type += "." + (getRelatingObject().getType());
        if ((getRelatingObject().getSubtype()) != null) {
            type += "." + (getRelatingObject().getSubtype());
        }
    }
    setType(type);
}