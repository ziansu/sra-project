public boolean isInQueue(java.io.File image) {
    return pluginContext.containsKey(getKey(image));
}