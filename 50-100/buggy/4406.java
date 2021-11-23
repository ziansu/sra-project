public void visitBody(org.apache.jasper.compiler.Node n) throws org.apache.jasper.JasperException {
    org.apache.jasper.compiler.SmapStratum smapSave = smap;
    java.lang.String innerClass = n.getInnerClassName();
    if (innerClass != null) {
        this.smap = ((org.apache.jasper.compiler.SmapStratum) (innerClassMap.get(innerClass)));
    }
    super.visitBody(n);
    smap = smapSave;
}