private void putDate(android.content.ContentValues values) {
    if (mEditFlag) {
        values.put("date", mDate);
    }else {
        values.put("date", mCurDate);
    }
}