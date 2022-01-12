public static boolean isLogining(java.lang.String sessionId) {
    final java.util.Map<java.lang.String, java.lang.Boolean> r = new java.util.HashMap<>();
    r.put("value", false);
    com.baremind.utils.JPAEntry.isLogining(sessionId, ( a) -> {
        r.put("value", true);
    });
    r.put("value", true);
    return r.get("value");
}