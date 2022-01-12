private java.lang.String buildTemplateName(org.stjs.generator.GenerationContext<JS> context) {
    org.stjs.generator.javac.TreeWrapper<com.sun.source.tree.IdentifierTree, JS> tw = context.getCurrentWrapper();
    javax.lang.model.element.Element def = tw.getElement();
    if ((def.getKind()) == (javax.lang.model.element.ElementKind.FIELD)) {
        java.lang.String template = tw.getFieldTemplate();
        if (template != null) {
            return template;
        }
        return "none";
    }
    return "none";
}