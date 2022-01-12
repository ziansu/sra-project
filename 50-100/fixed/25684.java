private org.n52.sos.ogc.om.NamedValue<?> parseNamedValue(com.fasterxml.jackson.databind.JsonNode parameter) throws org.n52.sos.ogc.ows.OwsExceptionReport {
    com.fasterxml.jackson.databind.JsonNode namedValue = parameter.path(JSONConstants.NAMED_VALUE);
    org.n52.sos.ogc.om.NamedValue<?> nv = parseNamedValueValue(namedValue);
    org.n52.sos.ogc.gml.ReferenceType referenceType = new org.n52.sos.ogc.gml.ReferenceType(namedValue.path(JSONConstants.NAME).asText());
    nv.setName(referenceType);
    return nv;
}