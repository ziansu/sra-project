public java.lang.String[] getDefaultTemplate() {
    for (template_configurator.Template tmpl : templates) {
        if (tmpl.getName().equals("Default_template")) {
            java.util.List<java.lang.String> result = get_list_of_properties(tmpl);
            return result.toArray(new java.lang.String[0]);
        }
    }
    java.lang.String[] defaultProps = new java.lang.String[]{ "content_type" , "created" , "valid" };
    return defaultProps;
}