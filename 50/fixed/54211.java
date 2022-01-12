public static double lpMin(org.codehaus.jettison.json.JSONObject q) {
    java.util.List<java.lang.Double> setL = annotatorstub.utils.SMAPHFeatures.getSetL(q);
    if (setL.isEmpty())
        return 0;
    
    return java.util.Collections.min(setL);
}