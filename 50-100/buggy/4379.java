public static void saveSessionToken(java.lang.String userId, java.lang.String token, java.lang.String ip) {
    java.lang.String query = (((((("INSERT INTO login_session (user_id, token, create_at, expire_at, expired, ip_addresses) VALUES" + " ('") + userId) + "', '") + token) + "', NOW(), DATE_ADD(NOW(), INTERVAL 180 SECOND), 0, '") + ip) + "')";
    com.avaje.ebean.SqlUpdate update = com.avaje.ebean.Ebean.createSqlUpdate(query);
}