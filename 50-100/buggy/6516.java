public static android.database.Cursor getStudy(android.content.Context c, java.lang.String study_url) {
    return c.getContentResolver().query(Aware_Provider.Aware_Studies.CONTENT_URI, null, ((((Aware_Provider.Aware_Studies.STUDY_URL) + " LIKE '") + study_url) + "'"), null, (("ORDER BY " + (Aware_Provider.Aware_Studies.STUDY_TIMESTAMP)) + " DESC LIMIT 1"));
}