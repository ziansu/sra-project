private java.util.Properties loadProperties(java.io.File propertiesFile) throws com.floreantpos.license.LicenseException {
    java.io.InputStream input = null;
    try {
        input = new java.io.FileInputStream(propertiesFile);
        java.util.Properties properties = new com.floreantpos.license.OrderedProperties();
        properties.load(input);
        return properties;
    } catch (java.lang.Exception e) {
        throw new com.floreantpos.license.LicenseException("Invalid license file! Please contact our support.", e);
    } finally {
        org.apache.commons.io.IOUtils.closeQuietly(input);
    }
}