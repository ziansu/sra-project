public long insertArtistCV(android.content.ContentValues values) {
    return insertArtistCV(helper.getWritableDatabase(), values);
}