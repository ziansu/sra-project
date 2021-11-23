private br.net.du.fscore.model.Match buildMatchFromCursor(android.database.Cursor cursor) {
    br.net.du.fscore.model.Match match = null;
    if (cursor != null) {
        match = new br.net.du.fscore.model.Match();
        match.setId(cursor.getLong(0));
        match.setName(cursor.getString(1));
        java.util.Calendar date = java.util.Calendar.getInstance();
        date.setTimeInMillis(cursor.getLong(2));
        match.setDate(date);
    }
    return match;
}