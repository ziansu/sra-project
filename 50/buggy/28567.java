private boolean checkNode(com.fasterxml.jackson.databind.JsonNode node) {
    return (node != null) && (!(node.isMissingNode()));
}