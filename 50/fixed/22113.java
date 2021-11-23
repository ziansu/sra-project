private boolean isValidRequest(com.fasterxml.jackson.databind.node.ObjectNode node) {
    return (backwardsCompatible) || (hasMethodAndVersion(node));
}