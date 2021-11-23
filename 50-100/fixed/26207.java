private void appendPreload(org.jboss.forge.roaster.model.source.JavaClassSource javaClass, java.lang.StringBuilder body, java.util.Set<? extends javax.lang.model.element.Element> list) {
    for (final javax.lang.model.element.Element element : list) {
        body.append("\npreloadClass(").append(getSimpleClassName(element)).append(".class);\n");
        javaClass.addImport(getClassName(element));
    }
}