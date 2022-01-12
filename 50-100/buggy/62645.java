public java.lang.String toString(com.github.openjson.JSONStringer stringer) throws com.github.openjson.JSONException {
    try {
        stringer.object();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : nameValuePairs.entrySet()) {
            stringer.entry(entry);
        }
        stringer.endObject();
        return stringer.toString();
    } catch (com.github.openjson.JSONException e) {
        return null;
    }
}