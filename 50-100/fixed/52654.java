private void cursorMoveTo(int i) {
    if (i < 0) {
        i = (mCursor.getCount()) - 1;
    }else
        if ((mCursor.getCount()) <= i) {
            i = 0;
        }
    
    com.fenix.audioplayer.MainActivity.sPosition = i;
    mCursor.moveToPosition(com.fenix.audioplayer.MainActivity.sPosition);
}