private void checkProperty(org.jetbrains.kotlin.resolve.JetProperty property, org.jetbrains.kotlin.resolve.PropertyDescriptor propertyDescriptor) {
    reportErrorIfHasIllegalModifier(property);
    org.jetbrains.kotlin.resolve.DeclarationDescriptor containingDeclaration = propertyDescriptor.getContainingDeclaration();
    if (containingDeclaration instanceof org.jetbrains.kotlin.resolve.ClassDescriptor) {
        checkPropertyAbstractness(property, propertyDescriptor, ((org.jetbrains.kotlin.resolve.ClassDescriptor) (containingDeclaration)));
    }else {
        modifiersChecker.reportIllegalModalityModifiers(property);
    }
    checkPropertyInitializer(property, propertyDescriptor);
    checkAccessors(property, propertyDescriptor);
    checkDeclaredTypeInPublicMember(property, propertyDescriptor);
}