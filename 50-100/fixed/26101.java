public static void convert(se.lth.cs.nlp.wikipedia.lang.TemplateConfig config, java.io.File indexPath, java.io.File pagesPath, java.io.File outputPath, int numThreads, int batchsize, java.lang.String outputFormat) {
    se.lth.cs.nlp.pipeline.Source<se.lth.cs.nlp.mediawiki.model.Page, java.lang.Void> source;
    if (indexPath == null)
        source = new se.lth.cs.nlp.mediawiki.parser.SinglestreamXmlDumpParser(pagesPath, batchsize);
    else
        source = new se.lth.cs.nlp.mediawiki.parser.MultistreamBzip2XmlDumpParser(indexPath, pagesPath, batchsize, numThreads);
    
    se.lth.cs.nlp.wikiforia.Pipeline pipeline = new se.lth.cs.nlp.wikiforia.Pipeline(source, se.lth.cs.nlp.wikiforia.App.getSink(outputFormat, outputPath), config);
    pipeline.run();
}