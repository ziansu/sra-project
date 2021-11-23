private void shareGetter(com.redhat.ceylon.compiler.typechecker.model.MethodOrValue d) {
    if ((d.isClassOrInterfaceMember()) || (d.isToplevel()))
        if ((d.isShared()) || ((prototypeStyle) && (d.isCaptured()))) {
            outerSelf(d);
            out(".");
            out(getter(d));
            out("=");
            out(getter(d));
            out(";");
            endLine();
        }
    
}