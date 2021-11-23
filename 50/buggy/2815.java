public static void main(java.lang.String[] args) {
    com.company.MutableGraph<java.lang.Integer> graph = com.company.GraphBuilder.directed().build();
    graph.addNode(1);
    graph.putEdge(2, 3);
    java.lang.System.out.println("HI");
}