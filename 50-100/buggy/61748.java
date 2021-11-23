public void write(uk.ac.ed.inf.srl.corpus.Sentence s) {
    try {
        rdf = new uk.ac.ed.inf.srl.rdf.RDF();
        uk.ac.ed.inf.srl.rdf.SentenceRDF rdfs = new uk.ac.ed.inf.srl.rdf.SentenceRDF(rdf, semlink, s, (++(snum)));
        rdf.write(out);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println("Failed to write sentance.");
        java.lang.System.exit(1);
    }
}