public static void main(java.lang.String[] argv) throws java.lang.Exception {
    java.util.Map<java.lang.String, java.util.List<java.lang.Double>> entity_features = annotatorstub.annotator.CandidateGenerator.get_entity_candidates("Funny cats wikipedia");
    annotatorstub.classification.ModelConverter serializer = new annotatorstub.classification.ModelConverter(entity_features);
    annotatorstub.classification.Classifier t = new annotatorstub.classification.Classifier();
    t.run();
}