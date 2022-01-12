public java.util.Map<java.lang.String, java.lang.Object> getAsMapWithStringKeys() {
    java.util.Map<java.lang.String, java.lang.Object> stringMap = new java.util.HashMap<>(this.auditInfo.size());
    for (java.util.Map.Entry<com.floragunn.searchguard.auditlog.impl.AuditMessage.AuditMessageKey, java.lang.Object> entry : this.auditInfo.entrySet()) {
        stringMap.put(entry.getKey().getName(), entry.getValue());
    }
    return stringMap;
}