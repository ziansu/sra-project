public static double rhoAvg(org.codehaus.jettison.json.JSONObject q, java.lang.String e) {
    java.util.List<java.lang.Double> P = annotatorstub.utils.SMAPHFeatures.getSetP(q, e);
    if (P.isEmpty())
        return 0;
    
    double avg = 0.0;
    for (java.lang.Double d : P)
        avg += d;
    
    avg /= P.size();
    return avg;
}