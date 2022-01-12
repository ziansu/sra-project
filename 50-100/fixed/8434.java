@org.junit.Test
public void testNoAppJSCompressionErrors() throws java.lang.Exception {
    java.lang.String[] namespaces = new java.lang.String[]{ "aura" , "ui" , "auradev" , "auradocs" , "auraStorage" };
    java.lang.StringBuilder source = new java.lang.StringBuilder();
    source.append("<aura:application>");
    for (java.lang.String ns : namespaces) {
        source.append(java.lang.String.format("<aura:dependency resource=\"%s:*\" type=\"*\" />", ns));
    }
    source.append("</aura:application>");
    getDefinitionsOutput(source.toString(), AuraContext.Mode.PROD);
}