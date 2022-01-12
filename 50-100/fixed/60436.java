java.lang.String getParentKey(java.lang.String wikiName, java.lang.String parent, java.lang.String menuSpace) {
    java.lang.String parentKey = "";
    if (parent != null) {
        parentKey = parent;
    }
    if ((parentKey.indexOf('.')) < 0) {
        parentKey = (menuSpace + ".") + parentKey;
    }
    if ((parentKey.indexOf(':')) < 0) {
        parentKey = (wikiName + ":") + parentKey;
    }
    return parentKey;
}