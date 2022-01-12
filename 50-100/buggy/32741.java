protected java.lang.Object annotationError(org.apache.commons.jexl3.parser.JexlNode node, java.lang.String annotation, java.lang.Throwable cause) {
    if (isStrictEngine()) {
        if (isSilent()) {
            logger.warn(org.apache.commons.jexl3.JexlException.annotationError(node, annotation), cause);
        }else {
            throw new org.apache.commons.jexl3.JexlException.Annotation(node, annotation, cause);
        }
    }else
        if (logger.isDebugEnabled()) {
            logger.debug(org.apache.commons.jexl3.JexlException.annotationError(node, annotation), cause);
        }
    
    return null;
}