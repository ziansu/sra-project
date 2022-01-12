public void addImport(invar.TypeStruct struct, java.util.TreeSet<java.lang.String> imps, java.lang.String s) {
    if ((s == null) || (s.isEmpty())) {
        return ;
    }
    invar.InvarType t = super.findType(getContext(), s);
    if (t == null) {
        logErr(("addImport() --- Can't find type named " + s));
        return ;
    }
    impsCheckAdd(imps, t, struct);
}