public boolean canHandle(org.visallo.core.ingest.graphProperty.Element element, java.lang.String propertyKey, java.lang.String propertyName, org.visallo.core.ingest.graphProperty.ElementOrPropertyStatus status) {
    if (!(this.isStarted())) {
        return true;
    }
    org.visallo.core.ingest.graphProperty.Property property = element.getProperty(propertyKey, propertyName);
    return canHandle(element, property, propertyKey, propertyName, status);
}