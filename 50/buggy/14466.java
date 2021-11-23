@java.lang.Override
public edu.stanford.nlp.pipeline.Annotator gender(java.util.Properties properties, boolean verbose) {
    return new edu.stanford.nlp.pipeline.ServerAnnotatorImplementations.SingletonAnnotator(host, port, properties, Annotator.STANFORD_GENDER);
}