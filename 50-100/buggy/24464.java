public org.motechproject.csd.domain.GetModificationsResponse getModifications(java.lang.String url, org.joda.time.DateTime lastModified) {
    org.motechproject.csd.domain.GetModificationsRequest getModificationsRequest = new org.motechproject.csd.domain.GetModificationsRequest();
    try {
        javax.xml.datatype.XMLGregorianCalendar c = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(lastModified.toGregorianCalendar());
        getModificationsRequest.setLastModified(c);
    } catch (javax.xml.datatype.DatatypeConfigurationException e) {
        org.motechproject.csd.client.SOAPClient.LOGGER.error("Could not parse lastModified date", e);
        return null;
    }
    org.motechproject.csd.domain.GetModificationsResponse response = ((org.motechproject.csd.domain.GetModificationsResponse) (getWebServiceTemplate().marshalSendAndReceive(url, getModificationsRequest)));
    return response;
}