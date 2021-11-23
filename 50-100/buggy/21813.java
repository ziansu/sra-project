@android.support.annotation.Nullable
public static com.playposse.egoeater.storage.PairingParcelable getNextPairing(android.content.ContentResolver contentResolver) {
    android.database.Cursor cursor = contentResolver.query(PipelineTable.CONTENT_URI, PipelineTable.COLUMN_NAMES, ((com.playposse.egoeater.contentprovider.EgoEaterContract.PipelineTable.ARE_PHOTOS_CACHED_COLUMN) + " = 1"), null, ((com.playposse.egoeater.contentprovider.EgoEaterContract.PipelineTable.ID_COLUMN) + " asc"));
    if ((cursor != null) && (cursor.moveToNext())) {
        com.playposse.egoeater.util.SmartCursor smartCursor = new com.playposse.egoeater.util.SmartCursor(cursor, com.playposse.egoeater.contentprovider.EgoEaterContract.PipelineTable.COLUMN_NAMES);
        return new com.playposse.egoeater.storage.PairingParcelable(smartCursor);
    }else {
        return null;
    }
}