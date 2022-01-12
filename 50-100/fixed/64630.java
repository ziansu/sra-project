private static boolean equals(final java.lang.reflect.WildcardType w, final java.lang.reflect.Type t) {
    if (t instanceof java.lang.reflect.WildcardType) {
        final java.lang.reflect.WildcardType other = ((java.lang.reflect.WildcardType) (t));
        return (org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(other))) && (org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(other)));
    }
    return false;
}