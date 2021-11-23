public static double commAvg(it.unipi.di.acube.batframework.utils.WikipediaApiInterface wikiApi, org.codehaus.jettison.json.JSONObject q, java.lang.String e) {
    java.util.List<java.lang.Double> setC = annotatorstub.utils.SMAPHFeatures.getSetC(wikiApi, q, e);
    if (setC.isEmpty())
        return 0;
    
    double avg = 0.0;
    for (java.lang.Double d : setC)
        avg += d;
    
    avg /= setC.size();
    return avg;
}