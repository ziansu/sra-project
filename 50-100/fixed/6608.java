protected java.lang.String getName(com.google.gwt.core.ext.typeinfo.JClassType source) {
    if ((source.getEnclosingType()) != null) {
        return ((getName(source.getEnclosingType())) + "_") + (source.getSimpleSourceName());
    }
    return source.getSimpleSourceName();
}