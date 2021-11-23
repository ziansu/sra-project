@java.lang.SuppressWarnings(value = "unchecked")
public void addSearchPath(final java.lang.String filePath, int priority) {
    nodes.add(new com.ocdsoft.bacta.tre.SearchPath(priority, filePath));
    java.util.Collections.sort(((java.util.ArrayList) (nodes)));
}