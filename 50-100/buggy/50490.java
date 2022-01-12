@java.lang.Override
public void change(com.epimorphics.lr.jena.query.text.QuadAction qaction, org.apache.jena.graph.Node g, org.apache.jena.graph.Node s, org.apache.jena.graph.Node p, org.apache.jena.graph.Node o) {
    com.epimorphics.lr.jena.query.text.Quad quad = new com.epimorphics.lr.jena.query.text.Quad(g, s, p, o);
    switch (qaction) {
        case ADD :
            indexNewQuad(quad);
            break;
        case DELETE :
            unIndex(quad);
            break;
        case NO_ADD :
            com.epimorphics.lr.jena.query.text.TextDocProducerBatch.log.warn("Saw change action NO_ADD, but ignoring it!");
            break;
        case NO_DELETE :
            com.epimorphics.lr.jena.query.text.TextDocProducerBatch.log.warn("Saw change action NO_DELETE, but ignoring it!");
            break;
    }
}