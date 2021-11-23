private static ConceptGraph.Input.Scraper getScraper(ConceptGraph.Output.FileOutputAssistant fileOutput, ConceptGraph.Output.Logging.Logger logger, ConceptGraph.Processor processor) throws java.io.FileNotFoundException {
    ConceptGraph.Output.Storage.GraphStore graphStore = new ConceptGraph.Output.Storage.IndividualFilesGraphStore(fileOutput, logger);
    java.io.Reader baseReader = new java.io.FileReader("C:\\wikidump\\enwiki-20150205-pages-articles-multistream.xml");
    ConceptGraph.Input.WikiDumpReader wikiReader = new ConceptGraph.Input.WikiDumpReader(baseReader);
    ConceptGraph.Input.WikiPageXmlParser xmlParser = new ConceptGraph.Input.WikiPageXmlParser(logger);
    return new ConceptGraph.Input.XmlScraper(processor, logger, graphStore, wikiReader, xmlParser);
}