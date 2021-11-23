public java.lang.Object call(java.lang.String className, java.lang.Object[] args) {
    java.lang.Object result = null;
    try {
        java.lang.Object inst = pluginMap.get(className);
        log.debug((("Invoke method of : " + className) + ".call()"));
        for (java.lang.Object arg : args)
            log.debug(("Argument : " + arg));
        
        result = ((tribunal.core.Plugin) (inst)).call(args);
    } catch (java.lang.Exception e) {
        log.error(e);
    }
    return result;
}