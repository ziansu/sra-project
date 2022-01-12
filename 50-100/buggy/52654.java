private void cursorMoveTo(int i) {
    android.util.Log.d(com.fenix.audioplayer.MainActivity.TEST, ((("size = " + (mCursor.getCount())) + "  ") + i));
    if (i < 0) {
        i = (mCursor.getCount()) - 1;
    }else
        if ((mCursor.getCount()) == i) {
            i = 0;
        }
    
    com.fenix.audioplayer.MainActivity.sPosition = i;
    mCursor.moveToPosition(com.fenix.audioplayer.MainActivity.sPosition);
}