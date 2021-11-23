private void appendPreload(org.jboss.forge.roaster.model.source.JavaClassSource javaClass, java.lang.StringBuilder body, java.util.Set<? extends javax.lang.model.element.Element> list) {
    for (final javax.lang.model.element.Element element : list) {
        final org.jrebirth.af.api.annotation.Preload p = element.getAnnotation(org.jrebirth.af.api.annotation.Preload.class);
        body.append("\npreloadClass(").append(getSimpleClassName(element)).append(".class);\n");
        javaClass.addImport(getClassName(element));
    }
}