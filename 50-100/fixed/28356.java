public void setUsableLocation(java.lang.String fileType) {
    if (!(pcgen.output.publish.OutputDB.isLegal(fileType))) {
        throw new java.lang.IllegalArgumentException(("Invalid Data Definition Location: " + fileType));
    }
    java.lang.Class<? extends pcgen.cdom.base.Loadable> cl = pcgen.util.StringPClassUtil.getClassFor(fileType);
    if (cl == null) {
        throw new java.lang.IllegalArgumentException(("Invalid Data Definition Location: " + fileType));
    }
    this.usableLocation = ((java.lang.Class<T>) (cl));
}