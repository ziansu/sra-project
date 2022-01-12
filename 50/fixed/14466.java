@java.lang.Override
public edu.stanford.nlp.pipeline.Annotator gender(java.util.Properties properties, java.lang.String name) {
    return new edu.stanford.nlp.pipeline.ServerAnnotatorImplementations.SingletonAnnotator(host, port, properties, Annotator.STANFORD_GENDER);
}