public static void create(java.lang.String ip, java.lang.String url, com.giisoo.framework.common.V v) {
    try {
        long created = java.lang.System.currentTimeMillis();
        java.lang.String id = com.giisoo.core.bean.UID.id(ip, url, created);
        com.giisoo.core.bean.Bean.insert(v.set("id", id).set("ip", ip).set("url", url).set("created", created), com.giisoo.framework.common.AccessLog.class);
    } catch (java.lang.Exception e) {
    }
}