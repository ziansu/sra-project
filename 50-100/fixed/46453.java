@java.lang.Override
protected java.util.Map<java.lang.String, java.lang.Object> getVendorProperties() {
    java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    map.put("eclipselink.weaving", "static");
    map.put("eclipselink.logging.parameters", "true");
    map.put("eclipselink.cache.shared.default", "false");
    map.put("eclipselink.jdbc.cache-statements", "true");
    map.put("org.hibernate.flushMode", "COMMIT");
    map.put(PersistenceUnitProperties.SESSION_CUSTOMIZER, "com.huoyun.core.jpa.SessionCustomizerImpl");
    return map;
}