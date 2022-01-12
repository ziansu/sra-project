public java.lang.String encode(java.lang.String format) throws it.infn.security.saml.schema.SchemaManagerException {
    if (!(SCIMConstants.APPLICATION_JSON.endsWith(format))) {
        throw new it.infn.security.saml.schema.SchemaManagerException("Unsupported format");
    }
    if (type.equals(it.infn.security.saml.ocp.SPIDAttributeValue.SPID_STRING_TYPE)) {
        return ((java.lang.String) (value));
    }else
        if (type.equals(it.infn.security.saml.ocp.SPIDAttributeValue.SPID_DATE_TYPE)) {
            return java.lang.Long.toString(((java.util.Date) (value)).getTime());
        }
    
    return null;
}