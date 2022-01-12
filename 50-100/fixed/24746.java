protected void validateNamespace(java.lang.String namespace, java.lang.String filePath, org.antlr.v4.runtime.ParserRuleContext ctx) {
    if (!(sources.containsKey(namespace))) {
        sources.put(namespace, filePath);
    }else
        if (!(sources.get(namespace).equals(filePath))) {
            notifyErrorListeners(((("Namespace Conflict: '" + namespace) + "' already defined as ") + (sources.get(namespace))), ctx.start);
        }
    
}