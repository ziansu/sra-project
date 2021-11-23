@java.lang.Override
public com.einzig.ipst2.portal.PortalAccepted build(java.lang.String name, java.util.Date dateResponded, java.lang.String message) {
    java.lang.String pictureURL = parsePictureURL(message, name);
    java.lang.String address = parseLiveAddress(message);
    java.lang.String intelLink = parseIntelLink(message);
    return new com.einzig.ipst2.portal.PortalAccepted(name, null, pictureURL, dateResponded, address, intelLink);
}