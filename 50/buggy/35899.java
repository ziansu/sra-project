public static double rhoMax(org.codehaus.jettison.json.JSONObject q, java.lang.String e) {
    java.util.List<java.lang.Double> P = annotatorstub.utils.SMAPHFeatures.getSetP(q, e);
    return java.util.Collections.max(P);
}