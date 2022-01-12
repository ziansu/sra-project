public boolean isHeadersAvailable(org.ballerinalang.util.codegen.AnnAttachmentInfo configAnnotInfo) {
    this.configAnnotInfo = configAnnotInfo;
    boolean hasCorsHeaders = false;
    for (java.lang.String header : corsHeaders) {
        attributeValue = configAnnotInfo.getAttributeValue(header);
        if ((attributeValue) != null) {
            hasCorsHeaders = true;
            break;
        }
    }
    return hasCorsHeaders;
}