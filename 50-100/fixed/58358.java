@java.lang.Override
public java.lang.String toString() {
    if (strategy.isEmpty()) {
        return "empty";
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int[] vertices : strategy) {
        for (int vertex : vertices) {
            sb.append(((vertex + 1) + " "));
        }
        sb.append(java.lang.System.lineSeparator());
    }
    return sb.toString();
}