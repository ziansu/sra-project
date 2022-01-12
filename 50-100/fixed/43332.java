private void getLeafNodes(int v, java.util.List<java.lang.Integer> leafs) {
    if ((vertices[v].size()) == 0) {
        leafs.add(v);
    }
    for (int i = 0; i < (vertices[v].size()); i++) {
        if (v < (vertices[v].get(i))) {
            getLeafNodes(vertices[v].get(i), leafs);
        }
    }
}