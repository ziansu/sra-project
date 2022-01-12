@java.lang.Override
public com.fasterxml.jackson.databind.node.TextNode textNode(java.lang.String text) {
    java.lang.String resolvedText = resolver.resolveString(text);
    if (logger.isInfoEnabled()) {
        if (text == null ? resolvedText == null : text.equals(resolvedText)) {
            logger.debug("Resolve '{}' into '{}'", text, resolvedText);
        }else {
            logger.info("Resolve '{}' into '{}'", text, resolvedText);
        }
    }
    return super.textNode(resolvedText);
}