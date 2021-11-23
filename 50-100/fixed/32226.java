public static java.lang.Object convert(java.lang.String t, java.lang.String s) {
    if (s == null)
        return null;
    
    aQute.bnd.header.Attrs.Type type = aQute.bnd.header.Attrs.toType(t);
    if (type == null)
        return s;
    
    return aQute.bnd.header.Attrs.convert(type, s);
}