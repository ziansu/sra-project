io.github.fvasco.pinpoi.model.Placemark cursorToPlacemark(android.database.Cursor cursor) {
    final io.github.fvasco.pinpoi.model.Placemark p = new io.github.fvasco.pinpoi.model.Placemark();
    p.setId(cursor.getLong(0));
    p.setLatitude(cursor.getFloat(1));
    p.setLongitude(cursor.getFloat(2));
    p.setName(cursor.getString(3));
    p.setDescription(cursor.getString(4));
    p.setCollectionId(cursor.getLong(5));
    return p;
}