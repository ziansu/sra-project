public void writeTo(java.io.Writer writer) throws java.io.IOException {
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> pref : allPrefs.entrySet()) {
        writer.append("user_pref(\"").append(pref.getKey()).append("\", ");
        writer.append(valueAsPreference(pref.getValue()));
        writer.append(");\n");
    }
}