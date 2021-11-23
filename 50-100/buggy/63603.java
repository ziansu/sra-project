private void share(com.redhat.ceylon.compiler.typechecker.model.Declaration d) {
    if ((d.isClassOrInterfaceMember()) || (d.isToplevel()))
        if ((d.isShared()) || ((prototypeStyle) && (d.isCaptured()))) {
            outerSelf(d);
            out(".");
            out(d.getName());
            out("=");
            out(d.getName());
            out(";");
            endLine();
        }
    
}