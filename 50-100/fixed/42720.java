@javax.enterprise.inject.Produces
public org.ferris.prayer.console.application.Application produceApplication() {
    log.info("ENTER");
    java.util.jar.Attributes attributes = getAttributes();
    org.ferris.prayer.console.application.Application application = new org.ferris.prayer.console.application.Application(attributes.getValue("Implementation-Title"), attributes.getValue("Implementation-Version"), attributes.getValue("Implementation-URL"));
    return application;
}