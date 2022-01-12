public static void add(javax.servlet.http.HttpSession session, java.lang.String key, java.lang.Object value) {
    java.util.Map<java.lang.String, java.lang.Object> map = com.liferay.portal.kernel.servlet.SessionErrors._getMap(session, null, true);
    if (map == null) {
        return ;
    }
    map.put(key, value);
}