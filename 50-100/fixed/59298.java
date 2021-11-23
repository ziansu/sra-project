private java.lang.Object[] doReaddir(java.lang.String dn) throws io.apigee.trireme.kernel.OSException {
    java.io.File f = translatePath(dn);
    java.util.List<java.lang.String> files = fs.readdir(f, dn);
    java.lang.Object[] objs = files.toArray(new java.lang.Object[files.size()]);
    org.mozilla.javascript.Context cx = org.mozilla.javascript.Context.enter();
    try {
        org.mozilla.javascript.Scriptable fileList = cx.newArray(this, objs);
        return new java.lang.Object[]{ org.mozilla.javascript.Undefined.instance , fileList };
    } finally {
        org.mozilla.javascript.Context.exit();
    }
}