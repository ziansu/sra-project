public static java.lang.Long getLoginId(java.lang.String sessionId) {
    final java.util.Map<java.lang.String, java.lang.Long> r = new java.util.HashMap<>();
    r.put("value", 0L);
    com.baremind.utils.JPAEntry.isLogining(sessionId, ( a) -> {
        a.setLastOperationTime(new java.util.Date());
        com.baremind.utils.JPAEntry.genericPut(a);
        r.put("value", a.getUserId());
    });
    return r.get("value");
}