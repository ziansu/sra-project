protected boolean hasNextLink(com.fasterxml.jackson.databind.JsonNode node) {
    com.fasterxml.jackson.databind.JsonNode atIotLinkPath = node.path(org.n52.shared.sensorthings.decoder.AT_IOT_NEXT_LINK);
    if (!(checkNode(atIotLinkPath))) {
        com.fasterxml.jackson.databind.JsonNode linkPath = node.path(org.n52.shared.sensorthings.decoder.NEXT_LINK);
        return checkNode(linkPath);
    }
    return true;
}