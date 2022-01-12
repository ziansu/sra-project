private void emitSuperMemberInjectorFieldIfNeeded(com.squareup.javapoet.TypeSpec.Builder scopeMemberTypeSpec) {
    if ((superClassThatNeedsInjection) != null) {
        com.squareup.javapoet.ClassName superTypeThatNeedsInjection = com.squareup.javapoet.ClassName.get(superClassThatNeedsInjection);
        com.squareup.javapoet.ParameterizedTypeName memberInjectorSuperParameterizedTypeName = com.squareup.javapoet.ParameterizedTypeName.get(com.squareup.javapoet.ClassName.get(toothpick.MemberInjector.class), superTypeThatNeedsInjection);
        com.squareup.javapoet.FieldSpec.Builder superMemberInjectorField = com.squareup.javapoet.FieldSpec.builder(memberInjectorSuperParameterizedTypeName, "superMemberInjector", javax.lang.model.element.Modifier.PRIVATE).initializer("new $L$$$$MemberInjector()", superTypeThatNeedsInjection);
        scopeMemberTypeSpec.addField(superMemberInjectorField.build());
    }
}