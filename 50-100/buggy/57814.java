public void add(int docid, double[] docvector) {
    org.meresco.lucene.search.PageRank.Node docnode = this.addDocNode(docid);
    for (int ord = 0; ord < (docvector.length); ord++)
        this.addEdge(docnode, this.addTermNode(ord), docvector[ord]);
    
}