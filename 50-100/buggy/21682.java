public void add(int docid, double[] docvector) {
    org.meresco.lucene.search.PageRank.Node docnode = this.addDocNode(docid);
    for (int ord = 0; ord < (docvector.length); ord++) {
        org.meresco.lucene.search.PageRank.Node termnode = this.addTermNode(ord);
        this.addEdge(docnode, termnode, docvector[ord]);
    }
}