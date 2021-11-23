public static synchronized void writeChanges(java.util.Properties changes) throws java.io.IOException {
    java.util.Properties homeProps = new java.util.Properties();
    java.io.InputStream homeStream = org.openecard.common.OpenecardProperties.loadHomeProps();
    homeProps.load(homeStream);
    homeStream.close();
    for (java.util.Map.Entry<java.lang.Object, java.lang.Object> next : changes.entrySet()) {
        homeProps.put(next.getKey(), next.getValue());
    }
    org.openecard.common.OpenecardProperties.saveHomeProps(homeProps);
}