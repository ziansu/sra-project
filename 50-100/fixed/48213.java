@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (adjacencyMatrix.length); i++) {
        for (int j = 0; j < (adjacencyMatrix.length); j++) {
            sb.append(adjacencyMatrix[i][j]);
            sb.append(" ");
        }
        sb.append("\n");
    }
    return sb.toString();
}