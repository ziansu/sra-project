public void addEdge(int u, int v) {
    if (this.edges.containsKey(u)) {
        this.edges.get(u).add(v);
    }else {
        java.util.List<java.lang.Integer> destList = new structures.LinkedList<java.lang.Integer>();
        destList.add(v);
        this.edges.put(u, destList);
    }
}