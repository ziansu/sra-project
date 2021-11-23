public void enterConstructorDeclaration(jd.gui.service.type.JavaParser.ConstructorDeclarationContext ctx) {
    int access = getClassBodyDeclarationAccessFlag(ctx.getParent().getParent());
    java.lang.String paramDescriptors = createParamDescriptors(ctx.formalParameters().formalParameterList());
    java.lang.String descriptor = paramDescriptors + "V";
    currentType.getMethods().add(new jd.gui.service.type.JavaFileTypeFactoryProvider.JavaMethod(access, "<init>", descriptor));
}