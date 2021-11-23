public static java.lang.String convert2KAST_Type(org.eclipse.jdt.core.dom.ITypeBinding jType) {
    java.lang.String type = jType.toString();
    if (jType.isPrimitive()) {
        type = (type.equals("boolean")) ? "bool" : type;
    }else {
        type = "class ." + type;
    }
    return type;
}