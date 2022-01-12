public void removeXAttr(java.lang.String src, org.apache.hadoop.fs.XAttr xAttr) throws java.io.IOException {
    if ((src == null) && (xAttr == null)) {
        throw new java.lang.IllegalArgumentException("Argument is null");
    }
    checkIfFileExisted(src);
    java.util.List<org.apache.hadoop.fs.XAttr> targetXAttrList = com.google.common.collect.Lists.newArrayListWithCapacity(1);
    targetXAttrList.add(xAttr);
    try {
        getXAttrs(src, targetXAttrList);
    } catch (java.io.IOException e) {
        throw new java.io.IOException("No matching attributes found for remove operation");
    }
    this.nodeManager.removeXAttr(src, xAttr);
}