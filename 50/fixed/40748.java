@java.lang.Override
public java.lang.String toString() {
    try {
        return toString(new com.github.openjson.JSONStringer());
    } catch (com.github.openjson.JSONException e) {
        return null;
    }
}