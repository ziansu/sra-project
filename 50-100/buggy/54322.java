public void insertToDatabase(int wid, java.lang.String wName, int wPosition, java.lang.String wURL, byte[] wIcon, boolean jsEnabled) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("wid", wid);
    values.put("wName", wName);
    values.put("wPosition", wPosition);
    values.put("wURL", wURL);
    values.put("wIcon", wIcon);
    values.put("jsEnabled", jsEnabled);
    database.insert("Wrapper", null, values);
}