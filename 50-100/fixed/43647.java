@java.lang.Override
public java.util.Set<java.lang.Integer> getNeighbours(int vertex) {
    java.util.Set<java.lang.Integer> result = new java.util.HashSet<java.lang.Integer>();
    final java.util.Map<java.lang.Integer, java.lang.Integer> vertexObj = list.get(vertex);
    if (null != vertexObj) {
        for (java.lang.Integer e : vertexObj.keySet()) {
            if ((vertexObj.get(e)) >= 0) {
                result.add(e);
            }
        }
    }
    return result;
}