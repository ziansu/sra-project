private java.util.LinkedHashMap<java.lang.String, java.lang.String> getRingtones() {
    java.util.LinkedHashMap<java.lang.String, java.lang.String> ringtone = new java.util.LinkedHashMap<>();
    android.media.RingtoneManager manager = new android.media.RingtoneManager(this);
    cursor = manager.getCursor();
    while (cursor.moveToNext()) {
        ringtone.put(cursor.getString(1), (((cursor.getString(2)) + "/") + (cursor.getString(0))));
    } 
    return ringtone;
}