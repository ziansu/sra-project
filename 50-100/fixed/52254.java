@java.lang.Override
public synchronized void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL("CREATE TABLE apis (id TEXT, name TEXT, url TEXT, readonlyurl TEXT, notesurl TEXT, user TEXT, pass TEXT, preset TEXT, showicon INTEGER DEFAULT 1, oauth INTEGER DEFAULT 0, accesstoken TEXT, accesstokensecret TEXT)");
    db.execSQL("CREATE TABLE presets (id TEXT, name TEXT, url TEXT, lastupdate TEXT, data TEXT, active INTEGER DEFAULT 0)");
    db.execSQL("CREATE TABLE geocoders (id TEXT, type TEXT, version INTEGER DEFAULT 0, name TEXT, url TEXT, active INTEGER DEFAULT 0)");
    addGeocoder(db, de.blau.android.prefs.AdvancedPrefDatabase.ID_DEFAULT_GEOCODER_NOMINATIM, de.blau.android.prefs.AdvancedPrefDatabase.ID_DEFAULT_GEOCODER_NOMINATIM, de.blau.android.prefs.AdvancedPrefDatabase.GeocoderType.NOMINATIM, 0, Urls.DEFAULT_NOMINATIM_SERVER, true);
    addGeocoder(db, de.blau.android.prefs.AdvancedPrefDatabase.ID_DEFAULT_GEOCODER_PHOTON, de.blau.android.prefs.AdvancedPrefDatabase.ID_DEFAULT_GEOCODER_PHOTON, de.blau.android.prefs.AdvancedPrefDatabase.GeocoderType.PHOTON, 0, Urls.DEFAULT_PHOTON_SERVER, true);
}