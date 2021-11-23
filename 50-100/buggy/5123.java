protected android.database.Cursor getSelectionCursor(java.lang.String constraint) {
    java.lang.String[] mSelectionArgs = new java.lang.String[]{ ("%" + constraint) + "%" };
    return getContext().getContentResolver().query(tbd.getUri(), mProjection, mSelection, mSelectionArgs, mOrderBy);
}