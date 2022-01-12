public static java.lang.String getIntentUri(android.content.Intent i) {
    java.lang.String rtr = "";
    try {
        java.lang.reflect.Method m = android.content.Intent.class.getMethod("toUri", int.class);
        rtr = ((java.lang.String) (m.invoke(i, android.content.Intent.class.getField("URI_INTENT_SCHEME").getInt(null))));
    } catch (java.lang.Exception e) {
        rtr = i.toURI();
    }
    return rtr;
}