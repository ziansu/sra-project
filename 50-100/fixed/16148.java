public static boolean isImdnService(com.gsma.rcs.core.ims.protocol.sip.SipRequest request) {
    java.lang.String content = request.getContent();
    java.lang.String contentType = request.getContentType();
    return (((content != null) && (content.contains(ImdnDocument.IMDN_NAMESPACE))) && (contentType != null)) && (contentType.equalsIgnoreCase(CpimMessage.MIME_TYPE));
}