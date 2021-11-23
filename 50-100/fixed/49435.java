public static double ambigAvg(it.unipi.di.acube.batframework.utils.WikipediaApiInterface wikiApi, org.codehaus.jettison.json.JSONObject q, java.lang.String e) {
    java.util.List<java.lang.Integer> latinA = annotatorstub.utils.SMAPHFeatures.getSetLatinA(q, e);
    if (latinA.isEmpty())
        return 0;
    
    double avg = 0.0;
    for (java.lang.Integer d : latinA)
        avg += ((double) (d));
    
    avg /= latinA.size();
    return avg;
}