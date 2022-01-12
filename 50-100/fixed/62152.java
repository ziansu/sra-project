@java.lang.Override
public synchronized void startup() {
    try {
        freemarker.template.DefaultObjectWrapperBuilder objectWrapperBuilder = new freemarker.template.DefaultObjectWrapperBuilder(interactivespaces.service.template.internal.freemarker.FreemarkerTemplater.FREEMARKER_VERSION);
        freemarkerConfig = new freemarker.template.Configuration(interactivespaces.service.template.internal.freemarker.FreemarkerTemplater.FREEMARKER_VERSION);
        freemarkerConfig.setDirectoryForTemplateLoading(templateDirectory);
        freemarkerConfig.setObjectWrapper(objectWrapperBuilder.build());
    } catch (java.lang.Exception e) {
        freemarkerConfig = null;
        throw new interactivespaces.InteractiveSpacesException("Cannot initialize Freemarker templater", e);
    }
}