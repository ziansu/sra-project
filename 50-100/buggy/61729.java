public static double boldTerms(org.codehaus.jettison.json.JSONObject q) {
    java.util.List<java.lang.String> boldWords = annotatorstub.utils.SMAPHFeatures.getBoldWords(q);
    double avgLength = 0.0;
    for (java.lang.String bw : boldWords) {
        avgLength += bw.length();
    }
    avgLength /= boldWords.size();
    return avgLength;
}