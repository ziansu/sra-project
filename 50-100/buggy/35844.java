@org.junit.Test
@java.lang.SuppressWarnings(value = "javadoc")
public void testInit() throws freemarker.core.ParseException, freemarker.template.MalformedTemplateNameException, freemarker.template.TemplateException, freemarker.template.TemplateNotFoundException, java.io.IOException {
    org.keyboardplaying.tree.model.Variations<java.lang.String> v = new org.keyboardplaying.tree.model.Variations(java.util.Arrays.asList("hello", "world"));
    org.keyboardplaying.tree.model.Node<org.keyboardplaying.tree.model.Variations<java.lang.String>> node = new org.keyboardplaying.tree.model.Node(v);
    org.keyboardplaying.tree.reporter.FreemarkerReporter reporter = new org.keyboardplaying.tree.reporter.FreemarkerReporter();
    reporter.generateReport(FreemarkerReporter.TPL_HTML_BOOTSTRAP, node, new java.io.StringWriter());
}