@java.lang.Override
public org.jetbrains.kotlin.resolve.SimpleType invoke() {
    return typeResolver.resolveAbbreviatedType(scopeWithTypeParameters, typeReference, trace, true);
}