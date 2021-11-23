protected static double tfIdf(java.util.List<java.lang.String> doc, java.util.List<java.util.List<java.lang.String>> docs, java.lang.String term) {
    return (com.project.Util.TfIdfCalculator.tf(doc, term)) * (com.project.Util.TfIdfCalculator.idf(docs, term));
}