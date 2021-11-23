public java.lang.Object call(java.lang.String className, java.lang.Object[] args) throws java.lang.Exception {
    java.lang.Object result = null;
    java.lang.Object inst = pluginMap.get(className);
    log.debug((("Invoke method of : " + className) + ".call()"));
    for (java.lang.Object arg : args)
        log.debug(("Argument : " + arg));
    
    result = ((tribunal.core.Plugin) (inst)).call(args);
    return result;
}