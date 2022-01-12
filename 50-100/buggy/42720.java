@javax.enterprise.inject.Produces
@org.ferris.prayer.console.application.Prayer
public org.ferris.prayer.console.application.Application produceApplication() {
    log.info("ENTER");
    java.util.jar.Attributes attributes = getAttributes();
    org.ferris.prayer.console.application.Application application = new org.ferris.prayer.console.application.Application();
    application.setTitle(attributes.getValue("Implementation-Title"));
    application.setVersion(attributes.getValue("Implementation-Version"));
    application.setUrl(attributes.getValue("Implementation-URL"));
    return application;
}