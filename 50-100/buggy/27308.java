protected static void appendAnnotationJSON(buffer.variant.VariantRec var, java.lang.String key, json.JSONArray masterlist) {
    json.JSONArray existing = var.getjsonProperty(key);
    if ((existing == null) || ((existing.length()) == 0)) {
        var.addAnnotationJSON(key, masterlist);
    }
}