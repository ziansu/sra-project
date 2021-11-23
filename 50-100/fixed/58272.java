protected java.lang.Object unsolvableMethod(org.apache.commons.jexl3.parser.JexlNode node, java.lang.String method) {
    if (isStrictEngine()) {
        throw new org.apache.commons.jexl3.JexlException.Method(node, method);
    }else
        if (logger.isDebugEnabled()) {
            logger.debug(org.apache.commons.jexl3.JexlException.methodError(node, method));
        }
    
    return null;
}