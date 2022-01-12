protected final org.giiwa.framework.web.Template getTemplate(java.lang.String viewname, boolean allowEmpty) {
    org.giiwa.framework.web.Template template = org.giiwa.framework.web.Model.cache.get(viewname);
    if ((template == null) || (template.isSourceModified())) {
        template = Module.home.getTemplate(viewname, allowEmpty);
        org.giiwa.framework.web.Model.cache.put(viewname, template);
    }
    return template;
}