public static void assertParametersSuffice(java.util.Collection<com.onestopconcept.endpoints.config.ParameterName> params, java.lang.String template) throws com.databasesandlife.util.gwtsafe.ConfigurationException {
    if (template == null)
        return ;
    
    java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\$\\{([\\w-]+)\\}").matcher(template);
    while (m.find())
        if (!(params.contains(m.group(1))))
            throw new com.databasesandlife.util.gwtsafe.ConfigurationException((((("Pattern '" + template) + "' contains parameter ") + (m.group())) + " but it is not available"));
        
    
}