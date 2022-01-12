public static void main(java.lang.String[] args) {
    java.lang.String str = "A,b,c,f";
    java.lang.String[] edges = new java.lang.String[2];
    edges[0] = "A,F";
    edges[1] = "B,c";
    UndirectedGraph g = new UndirectedGraph(str, edges);
    java.lang.System.out.println(g.edgeExists("f,a"));
}