public void addDeparturePointsToProfile(int profileId, java.util.Vector<java.lang.Integer> departurePoints) {
    for (java.lang.Integer pt : departurePoints) {
        android.content.ContentValues cv = new android.content.ContentValues();
        cv.put("profile", profileId);
        cv.put("point", pt);
        java.lang.Long l = m_db.insert("profile_point", null, cv);
        android.util.Log.d("mbta", ("Got return code " + l));
    }
}