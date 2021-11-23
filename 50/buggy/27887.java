@java.lang.Override
public com.einzig.ipst2.portal.PortalRejected build(java.lang.String name, java.util.Date dateResponded, java.lang.String message) {
    java.lang.String pictureURL = parsePictureURL(message);
    java.lang.String rejectionReason = parseRejectionReason(message);
    return new com.einzig.ipst2.portal.PortalRejected(name, null, pictureURL, dateResponded, rejectionReason);
}