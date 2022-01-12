@java.lang.Override
public void getProperty(java.lang.String name, java.util.List<com.google.enterprise.connector.spi.Value> list) throws com.google.enterprise.connector.spi.RepositoryDocumentException {
    if (PropertyNames.ID.equalsIgnoreCase(name)) {
        java.lang.String val = ((java.lang.String) (props.get(name)));
        list.add(com.google.enterprise.connector.spi.Value.getStringValue(val));
    }else
        if (PropertyNames.DATE_LAST_MODIFIED.equalsIgnoreCase(name)) {
            getPropertyDateValue(name, list);
        }else {
            getPropertyValue(name, list);
        }
    
}