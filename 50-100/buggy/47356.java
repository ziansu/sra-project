private org.rythmengine.template.ITemplate asTemplate(org.rythmengine.extension.ICodeType type, java.util.Locale locale, org.rythmengine.RythmEngine engine) {
    if ((null == (name)) || (engine.isDevMode())) {
        refresh_(false);
    }
    org.rythmengine.template.TemplateBase tmpl = ((org.rythmengine.template.TemplateBase) (templateInstance_(engine).__cloneMe(engine(), null)));
    tmpl.__prepareRender(type, locale, engine);
    return tmpl;
}