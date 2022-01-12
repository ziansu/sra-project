public java.util.List<org.yarnandtail.andhow.compile.SimpleType> getInnerPath() {
    java.util.List<org.yarnandtail.andhow.compile.SimpleType> innerPath = null;
    if (((innerPathStack) != null) && ((innerPathStack.size()) > 0)) {
        innerPath = new java.util.ArrayList(innerPathStack);
    }else {
        innerPath = java.util.Collections.EMPTY_LIST;
    }
    return innerPath;
}