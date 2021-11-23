public static java.lang.String getImplicitKeyword(java.lang.Class c, util.trace.ImplicitKeywordKind anImplicitKeywordKind) {
    switch (anImplicitKeywordKind) {
        case OBJECT_CLASS_NAME :
            return c.getName();
        case OBJECT_PACKAGE_NAME :
            return c.getPackage().getName();
        case OBJECT_TO_STRING :
            util.trace.Tracer.error("Cannot get implicit keyword for class as implicit keyword is OBJECT_TO_STRING");
            return "";
    }
    return "";
}