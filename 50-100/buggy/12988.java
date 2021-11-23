@java.lang.Override
public void processOutput(com.lumens.engine.TransformComponent src, java.lang.String targetName, java.util.List<com.lumens.model.Element> output) {
    if (log.isDebugEnabled())
        log.debug(java.lang.String.format("Component '%s' output size '%d' target => '%s'", src.getName(), output.size(), targetName));
    
    processElementList(output);
}