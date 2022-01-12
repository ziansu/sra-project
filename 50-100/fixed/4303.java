public org.lilystudio.smarty4j.Template parseTemplate(java.lang.String smartyCode) throws java.io.IOException, org.lilystudio.smarty4j.TemplateException {
    org.lilystudio.smarty4j.Template template = templates.get(smartyCode);
    if (template != null) {
        return template;
    }
    template = new org.lilystudio.smarty4j.Template(this, smartyCode);
    templates.put(smartyCode, template);
    return template;
}