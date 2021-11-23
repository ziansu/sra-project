public java.lang.String getMimeType(int pos) {
    if (((com.fwgg8547.mycast.CardModel.mCursor) == null) || (!(com.fwgg8547.mycast.CardModel.mCursor.moveToPosition(pos)))) {
        android.util.Log.w(com.fwgg8547.mycast.CardModel.TAG, "fail movetopos");
    }
    int indx = com.fwgg8547.mycast.CardModel.mCursor.getColumnIndex(MediaStore.Images.Media.MIME_TYPE);
    java.lang.String mime = com.fwgg8547.mycast.CardModel.mCursor.getString(indx);
    return mime;
}