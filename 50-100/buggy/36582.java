public at.jku.ssw.cmm.compiler.Obj findField(java.lang.String name, at.jku.ssw.cmm.compiler.Struct type) {
    if ((type.kind) != (Struct.STRUCT)) {
        parser.SemErr((name + " is not in a struct"));
        return at.jku.ssw.cmm.compiler.Tab.noObj;
    }
    for (at.jku.ssw.cmm.compiler.Obj f = type.fields; f != null; f = f.next) {
        if (f.name.equals(name))
            return f;
        
    }
    parser.SemErr((name + " not found"));
    return at.jku.ssw.cmm.compiler.Tab.noObj;
}