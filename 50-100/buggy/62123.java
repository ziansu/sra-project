private void checkObject(org.jetbrains.kotlin.resolve.JetObjectDeclaration declaration, org.jetbrains.kotlin.resolve.ClassDescriptor classDescriptor) {
    reportErrorIfHasIllegalModifier(declaration);
    if (((declaration.isLocal()) && (!(declaration.isCompanion()))) && (!(declaration.isObjectLiteral()))) {
        trace.report(org.jetbrains.kotlin.resolve.LOCAL_OBJECT_NOT_ALLOWED.on(declaration, classDescriptor));
    }
}