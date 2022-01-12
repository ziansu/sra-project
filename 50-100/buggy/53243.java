@java.lang.Override
public java.lang.Object getValue(com.openbravo.data.loader.DataRead dr, int i) throws com.openbravo.basic.BasicException {
    java.util.Properties properties = new java.util.Properties();
    try {
        properties.loadFromXML(new java.io.ByteArrayInputStream(dr.getBytes(i)));
        return properties;
    } catch (java.io.IOException ex) {
        throw new com.openbravo.basic.BasicException(ex);
    }
}