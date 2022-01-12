@android.support.annotation.NonNull
protected android.database.Cursor getSelectionCursor(java.lang.String constraint) {
    java.lang.String[] mSelectionArgs = new java.lang.String[]{ ("%" + constraint) + "%" };
    android.database.Cursor c = getContext().getContentResolver().query(tbd.getUri(), mProjection, mSelection, mSelectionArgs, mOrderBy);
    assert c != null;
    return c;
}