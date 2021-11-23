@java.lang.Override
public int getItemCount() {
    if ((dataIsValid) && ((mCursor) != null)) {
        return mCursor.getCount();
    }else {
        return -1;
    }
}