public void addType(java.lang.String type) {
    if ((mTypes.length()) > 0) {
        mTypes.append("|");
    }
    mTypes.append(type);
}