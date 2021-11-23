public java.util.List<java.lang.String> getInnerPathNames() {
    java.util.List<java.lang.String> pathNames = null;
    if (((innerPathStack) != null) && ((innerPathStack.size()) > 0)) {
        pathNames = new java.util.ArrayList();
        for (org.yarnandtail.andhow.compile.SimpleType se : innerPathStack) {
            pathNames.add(se.getName());
        }
    }
    return java.util.Collections.EMPTY_LIST;
}