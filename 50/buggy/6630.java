public static final opennlp.tools.namefind.NameFinderME peopleFinder(java.lang.String path) throws java.io.FileNotFoundException, java.io.IOException, opennlp.tools.util.InvalidFormatException {
    if ((org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.pModel) == null)
        org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.initializeModel(org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.MODEL.PEOPLE, path);
    
    return new opennlp.tools.namefind.NameFinderME(org.apache.manifoldcf.agents.transformation.opennlp.OpenNlpExtractorConfig.pModel);
}