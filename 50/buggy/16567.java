public static boolean isJSONObject(java.lang.String string) {
    try {
        final com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        mapper.readTree(string);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}