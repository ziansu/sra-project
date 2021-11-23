public void enterTypeArguments(com.j2swift.TypeArgumentsContext ctx) {
    if ((ctx.getParent()) instanceof com.j2swift.ClassTypeContext) {
        com.j2swift.ClassTypeContext parent = ((com.j2swift.ClassTypeContext) (ctx.getParent()));
        if ((parent.classOrInterfaceType()) != null) {
            code.append(".").append(parent.Identifier());
        }
    }
    code.append("<");
}