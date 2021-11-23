@mockit.internal.util.Nonnull
private java.lang.String getOwnerClassDesc(@mockit.internal.util.Nonnull
java.lang.reflect.TypeVariable<?> typeVariable) {
    java.lang.reflect.GenericDeclaration owner = typeVariable.getGenericDeclaration();
    java.lang.Class<?> ownerClass = (owner instanceof java.lang.reflect.Member) ? ((java.lang.reflect.Member) (owner)).getDeclaringClass() : ((java.lang.Class<?>) (owner));
    return ownerClass.getName().replace('.', '/');
}