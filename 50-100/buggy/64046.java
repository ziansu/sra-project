public static void test(se.lth.cs.nlp.wikipedia.lang.TemplateConfig config, java.io.File indexPath, java.io.File pagesPath, int numThreads, int batchsize) {
    se.lth.cs.nlp.pipeline.Source<se.lth.cs.nlp.mediawiki.model.Page, java.lang.Void> source;
    if ((se.lth.cs.nlp.wikiforia.App.index) == null)
        source = new se.lth.cs.nlp.mediawiki.parser.SinglestreamXmlDumpParser(pagesPath, batchsize);
    else
        source = new se.lth.cs.nlp.mediawiki.parser.MultistreamBzip2XmlDumpParser(indexPath, pagesPath, batchsize, numThreads);
    
    se.lth.cs.nlp.wikiforia.Pipeline pipeline = new se.lth.cs.nlp.wikiforia.Pipeline(source, null, config, true);
    pipeline.run();
}