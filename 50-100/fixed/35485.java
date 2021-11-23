public java.lang.String getCurrentBluetoothValue(java.lang.String profileName) {
    android.database.sqlite.SQLiteDatabase database = this.getReadableDatabase();
    android.database.Cursor cursor = database.query(com.example.aero.localife.DatabaseHelperActivity.TABLE_PROFILE, new java.lang.String[]{ com.example.aero.localife.DatabaseHelperActivity.KEY_PROFILE_NAME , com.example.aero.localife.DatabaseHelperActivity.KEY_LOCATION_LATITUDE , com.example.aero.localife.DatabaseHelperActivity.KEY_LOCATION_LONGITUDE , com.example.aero.localife.DatabaseHelperActivity.KEY_BLUETOOTH }, ((com.example.aero.localife.DatabaseHelperActivity.KEY_PROFILE_NAME) + "=?"), new java.lang.String[]{ profileName }, null, null, null);
    if (cursor != null) {
        cursor.moveToFirst();
        java.lang.String bluetoothValue = cursor.getString(3);
        return bluetoothValue;
    }
    return null;
}