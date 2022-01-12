@java.lang.Override
public java.lang.String getMessage() {
    java.lang.StringBuilder result;
    if (problems.isEmpty()) {
        return null;
    }
    result = new java.lang.StringBuilder("stage command failed for the following stage(s):\n");
    for (java.util.Map.Entry<net.oneandone.sushi.fs.file.FileNode, java.lang.Exception> entry : problems.entrySet()) {
        result.append("  ").append(entry.getKey().getName()).append(": ").append(entry.getValue().getMessage());
    }
    return result.toString();
}