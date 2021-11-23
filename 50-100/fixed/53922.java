protected java.lang.Object unsolvableProperty(org.apache.commons.jexl3.parser.JexlNode node, java.lang.String var, java.lang.Throwable cause) {
    if (isStrictEngine()) {
        throw new org.apache.commons.jexl3.JexlException.Property(node, var, cause);
    }else
        if (logger.isDebugEnabled()) {
            logger.debug(org.apache.commons.jexl3.JexlException.propertyError(node, var), cause);
        }
    
    return null;
}