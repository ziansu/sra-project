public org.exist.xquery.LocalVariable createVariable(java.lang.String name) throws org.exist.xquery.XPathException {
    final org.exist.xquery.LocalVariable var = new org.exist.xquery.LocalVariable(org.exist.dom.QName.parse(context, name, null));
    if ((firstVar) == null) {
        firstVar = var;
    }
    return var;
}