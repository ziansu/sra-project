public static final opennlp.tools.tokenize.Tokenizer tokenizer(java.io.File path) throws java.io.FileNotFoundException, java.io.IOException, opennlp.tools.util.InvalidFormatException {
    if ((org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.tModel) == null)
        org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.initializeModel(org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.MODEL.TOKENIZER, path);
    
    return new opennlp.tools.tokenize.TokenizerME(org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.tModel);
}