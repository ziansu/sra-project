public java.lang.String getParentName() {
    if ((getParent()) != null) {
        return getParent().getName();
    }
    return getCategory().getName();
}