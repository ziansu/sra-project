private android.net.Uri insertWriterValues(android.content.ContentValues writerValues) {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "insertWriterValues");
    android.net.Uri writer = RadioTheaterContract.WritersEntry.buildWritersUri();
    return context.getContentResolver().insert(writer, writerValues);
}