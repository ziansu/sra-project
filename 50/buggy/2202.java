public edu.stanford.nlp.pipeline.Annotator gender(java.util.Properties properties, boolean verbose) {
    return new edu.stanford.nlp.pipeline.GenderAnnotator(false, properties.getProperty("gender.firstnames", DefaultPaths.DEFAULT_GENDER_FIRST_NAMES));
}