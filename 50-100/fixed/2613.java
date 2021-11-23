@java.lang.Override
public android.database.Cursor runQuery(java.lang.CharSequence charSequence) {
    android.database.Cursor managedCursor = null;
    if ((charSequence != null) && (!(charSequence.equals(mItemInList.getItem().getName())))) {
        managedCursor = mItemDS.getNames(charSequence.toString().trim());
        if (managedCursor.moveToFirst()) {
            mIsProposedItem = true;
        }
    }
    return managedCursor;
}