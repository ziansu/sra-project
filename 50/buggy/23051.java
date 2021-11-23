@java.lang.SuppressWarnings(value = "unchecked")
public void enqueue(com.filmon.maven.Image image) {
    pluginContext.put(getKey(image), true);
}