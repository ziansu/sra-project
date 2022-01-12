public boolean removeProfile(java.lang.String profileName) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    incrementDatabaseVersion();
    db.delete(dreamteam.focus.server.DatabaseConnector.TABLE_BLOCKED_APPS, ((((dreamteam.focus.server.DatabaseConnector.KEY_PROFILE_NAME) + "='") + profileName) + "'"), null);
    removeProfileFromAllSchedules(profileName);
    return (db.delete(dreamteam.focus.server.DatabaseConnector.TABLE_PROFILES, ((((dreamteam.focus.server.DatabaseConnector.KEY_NAME) + "='") + profileName) + "'"), null)) > 0;
}