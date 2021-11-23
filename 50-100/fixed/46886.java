protected void addHeader(java.lang.String token, okhttp3.Request.Builder builder) {
    java.lang.String locale = java.util.Locale.getDefault().getLanguage();
    builder.addHeader("Accept-Language", locale);
    builder.addHeader("Accept", "application/json");
    if (token != null) {
        builder.addHeader("Authorization", ("Token " + token));
    }
}