void writeTo(com.github.openjson.JSONStringer stringer) throws com.github.openjson.JSONException {
    stringer.array();
    for (java.lang.Object value : values) {
        stringer.value(value);
    }
    stringer.endArray();
}