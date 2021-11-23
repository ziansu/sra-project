public java.util.List<java.lang.Integer> inEdges(int i) {
    java.util.List<java.lang.Integer> edges = new java.util.ArrayList<java.lang.Integer>();
    for (int j = 0; i < (n); i++)
        if (a[j][i])
            edges.add(j);
        
    
    return edges;
}