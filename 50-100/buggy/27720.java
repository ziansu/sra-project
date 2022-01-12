private com.fasterxml.jackson.databind.JsonNode lookupStack(java.lang.Object name) {
    com.fasterxml.jackson.databind.JsonNode node = resolve(name, currentFrame);
    if (!(node.isMissingNode())) {
        return node;
    }
    com.squarespace.template.Frame frame = currentFrame;
    while ((frame != null) && (!(frame.stopResolution))) {
        node = resolve(name, frame);
        if (!(node.isMissingNode())) {
            return node;
        }
        frame = frame.parent();
    } 
    return undefined;
}