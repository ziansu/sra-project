@java.lang.Override
public java.lang.String render(java.io.File openedFile, pa.iscde.javadoc.internal.Type type, java.lang.String name) {
    java.lang.String generatedText = null;
    if (null != openedFile) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        pa.iscde.javadoc.generator.StringTemplateVisitor jDoc = new pa.iscde.javadoc.generator.StringTemplateVisitor(sb, type, name);
        pa.iscde.javadoc.internal.JavaDocServiceLocator.getJavaEditorService().parseFile(openedFile, jDoc);
        generatedText = sb.toString();
    }
    return generatedText;
}