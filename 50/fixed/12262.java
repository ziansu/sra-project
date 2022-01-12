public edu.stanford.nlp.pipeline.Annotator coref(java.util.Properties properties) {
    java.util.Properties corefProperties = edu.stanford.nlp.util.PropertiesUtils.extractPrefixedProperties(properties, ((Annotator.STANFORD_COREF) + "."), true);
    return new edu.stanford.nlp.pipeline.CorefAnnotator(corefProperties);
}