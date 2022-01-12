public static void removeApplicationBeanFromSession(javax.servlet.http.HttpSession session, java.lang.String spName) {
    if ((session.getAttribute("spUniqueIdMap")) == null) {
        return ;
    }
    java.util.Map<java.lang.String, java.util.UUID> spUniqueIdMap = ((java.util.HashMap<java.lang.String, java.util.UUID>) (session.getAttribute("spUniqueIdMap")));
    if ((spUniqueIdMap.get(spName)) == null) {
        return ;
    }
    session.removeAttribute(spUniqueIdMap.get(spName).toString());
    spUniqueIdMap.remove(spName);
}