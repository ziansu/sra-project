private java.lang.String getDirectAttachmentOption() {
    java.lang.String directAttachmentOption = "";
    try {
        directAttachmentOption = gov.hhs.fha.nhinc.properties.PropertyAccessor.getInstance(GATEWAY_PROPERTIES_FILE).getProperty(DIRECT_ATTACHMENT_OPTION);
    } catch (gov.hhs.fha.nhinc.properties.PropertyAccessException e) {
        e.printStackTrace();
        gov.hhs.fha.nhinc.direct.MimeMessageBuilder.LOG.error("Error occured in retrieving the direct attachment option. Defaulting to 'xdm'.");
        directAttachmentOption = "xdm";
    }
    gov.hhs.fha.nhinc.direct.MimeMessageBuilder.LOG.debug((("Direct: Direct attachment option is: '" + directAttachmentOption) + "'"));
    return directAttachmentOption;
}