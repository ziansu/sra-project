public java.lang.String getDateTime(int pos) {
    if (((com.fwgg8547.mycast.CardModel.mCursor) == null) || (!(com.fwgg8547.mycast.CardModel.mCursor.moveToPosition(pos)))) {
        android.util.Log.w(com.fwgg8547.mycast.CardModel.TAG, "fail movetopos");
    }
    int indx = com.fwgg8547.mycast.CardModel.mCursor.getColumnIndex(MediaStore.Images.Media.DATE_TAKEN);
    long timeofmil = com.fwgg8547.mycast.CardModel.mCursor.getLong(indx);
    java.util.Date date = new java.util.Date(timeofmil);
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy MM dd");
    return format.format(date);
}