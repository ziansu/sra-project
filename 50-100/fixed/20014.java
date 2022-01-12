private void addNotificationInt(com.openvehicles.OVMS.utils.NotificationData notificationData, android.database.sqlite.SQLiteDatabase db) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put("nType", notificationData.Type);
    contentValues.put("nTimestamp", isoDateTime.format(notificationData.Timestamp));
    contentValues.put("nTitle", notificationData.Title);
    contentValues.put("nMessage", notificationData.Message);
    db.insert("Notification", null, contentValues);
}