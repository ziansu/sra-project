protected java.lang.String parseNextLink(com.fasterxml.jackson.databind.JsonNode node) {
    com.fasterxml.jackson.databind.JsonNode atIotLinkPath = node.path(getNavigationLinkPath(org.n52.shared.sensorthings.decoder.AT_IOT_NEXT_LINK));
    if (checkNode(atIotLinkPath)) {
        return atIotLinkPath.asText();
    }else {
        com.fasterxml.jackson.databind.JsonNode linkPath = node.path(getNavigationLinkPath(org.n52.shared.sensorthings.decoder.NEXT_LINK));
        if (checkNode(linkPath)) {
            return linkPath.asText();
        }
    }
    return null;
}