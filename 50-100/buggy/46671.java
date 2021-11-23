@java.lang.Override
public void onDataSetChanged() {
    if ((mCursor) != null) {
        mCursor.close();
    }
    mCursor = mContext.getContentResolver().query(Contract.Quote.URI, Contract.Quote.QUOTE_COLUMNS.toArray(new java.lang.String[]{  }), null, null, Contract.Quote.COLUMN_SYMBOL);
    mCursor.moveToFirst();
    timber.log.Timber.d("This was called at least");
}