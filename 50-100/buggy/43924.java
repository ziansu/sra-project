private java.util.Collection attendanceSql(java.lang.String game, java.lang.String country, int offsetInHours) {
    java.lang.String query = java.lang.String.format("SELECT date, COUNT(DISTINCT player) FROM player WHERE date >= '%s' ", new org.joda.time.DateTime().plusHours(offsetInHours).minusDays(7).toDateTimeISO());
    if (country != null) {
        query += (" AND country = '" + country) + "'";
    }
    if (game != null) {
        query += (" AND rom = '" + game) + "'";
    }
    query += " GROUP BY DAY(date), HOUR(date)";
    return entityManager.createNativeQuery(query).getResultList();
}