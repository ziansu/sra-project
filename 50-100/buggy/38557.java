public static int captBolds(org.codehaus.jettison.json.JSONObject q) {
    java.util.List<java.lang.String> boldWords = annotatorstub.utils.SMAPHFeatures.getBoldWords(q);
    int nrCapitalised = 0;
    for (java.lang.String bw : boldWords) {
        if (java.lang.Character.isUpperCase(bw.charAt(0)))
            nrCapitalised++;
        
    }
    return nrCapitalised;
}