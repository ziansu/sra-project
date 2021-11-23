private void renderTemplate(com.google.template.soy.soytree.TemplateNode template, java.util.Collection<com.google.template.soy.soytree.defn.TemplateParam> paramsToTypeCheck) {
    env = com.google.template.soy.sharedpasses.render.Environment.create(template, data, ijData);
    try {
        checkStrictParamTypes(template, paramsToTypeCheck);
        visitChildren(template);
    } catch (com.google.template.soy.sharedpasses.render.RenderException re) {
        throw re.completeStackTraceElement(template);
    }
    env = null;
}