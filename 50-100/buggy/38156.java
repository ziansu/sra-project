public final boolean isWriteClassName(java.lang.reflect.Type fieldType, java.lang.Object obj) {
    return (out.isEnabled(SerializerFeature.WriteClassName)) && (((fieldType != null) || (!(out.isEnabled(SerializerFeature.NotWriteRootClassName)))) || ((context.parent) != null));
}