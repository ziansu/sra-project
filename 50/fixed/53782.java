public java.lang.String[] getTemplatesNames(java.util.Properties properties) {
    if (properties == null) {
        throw new java.lang.IllegalArgumentException("Properties are required!");
    }
    return parser.getArray(net.remotehost.domdetective.parser.TemplateParser.TEMPLATE_LIST_NAME, properties);
}