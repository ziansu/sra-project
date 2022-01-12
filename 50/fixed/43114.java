public void addEdge(T from, T... tos) {
    addEdge(from, java.util.Arrays.asList(tos));
}