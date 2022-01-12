@java.lang.Override
public java.lang.String getMessage() {
    java.lang.StringBuilder result;
    if (problems.isEmpty()) {
        return null;
    }
    result = new java.lang.StringBuilder("stage command failed for the following stage(s):\n");
    for (java.util.Map.Entry<java.lang.String, java.lang.Exception> entry : problems.entrySet()) {
        result.append("  ").append(entry.getKey()).append(": ").append(entry.getValue().getMessage());
    }
    return result.toString();
}