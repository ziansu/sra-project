@java.lang.Override
public java.lang.Boolean visitIntersection_Intersection(org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedIntersectionType subtype, org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedIntersectionType supertype, org.checkerframework.framework.type.visitor.VisitHistory visited) {
    javax.lang.model.util.Types types = checker.getTypeUtils();
    for (org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedDeclaredType subtypeI : subtype.directSuperTypes()) {
        for (org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedDeclaredType supertypeI : subtype.directSuperTypes()) {
            if (org.checkerframework.javacutil.TypesUtils.isErasedSubtype(types, subtypeI.getUnderlyingType(), supertypeI.getUnderlyingType())) {
                if (!(isSubtype(subtypeI, supertype))) {
                    return false;
                }
            }
        }
    }
    return true;
}