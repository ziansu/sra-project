private void process(java.lang.String filename) {
    uk.ac.ed.inf.srl.AbstractCoNLL09Reader reader = new uk.ac.ed.inf.srl.AllCoNLL09Reader(new java.io.File(filename));
    int snum = 1;
    uk.ac.ed.inf.srl.rdf.RDF rdf = new uk.ac.ed.inf.srl.rdf.RDF();
    for (uk.ac.ed.inf.srl.corpus.Sentence sen : reader.readAll()) {
        uk.ac.ed.inf.srl.rdf.SentenceRDF rdfs = new uk.ac.ed.inf.srl.rdf.SentenceRDF(rdf, semlink, sen, new java.lang.Integer(snum).toString());
        snum++;
        break;
    }
    rdf.write();
}