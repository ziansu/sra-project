public static double boldTerms(org.codehaus.jettison.json.JSONObject q) {
    java.util.List<java.util.ArrayList<java.lang.String>> boldWords = annotatorstub.utils.SMAPHFeatures.getBoldWords(q);
    double avgLength = 0.0;
    for (java.util.ArrayList<java.lang.String> bw : boldWords) {
        avgLength += bw.size();
    }
    avgLength /= boldWords.size();
    return avgLength;
}