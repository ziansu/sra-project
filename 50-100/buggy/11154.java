@java.lang.Override
public void processInput(com.lumens.engine.TransformComponent src, java.lang.String targetName, java.util.List<com.lumens.model.Element> input) {
    if (log.isDebugEnabled())
        log.debug(java.lang.String.format("Component '%s' input size '%d' target => '%s'", src.getName(), input.size(), targetName));
    
    processElementList(input);
}