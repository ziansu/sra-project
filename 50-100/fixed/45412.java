@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    return new android.content.CursorLoader(this, QuoteProvider.Quotes.CONTENT_URI, new java.lang.String[]{ com.sam_chordas.android.stockhawk.data.QuoteColumns.BIDPRICE , com.sam_chordas.android.stockhawk.data.QuoteColumns.SYMBOL }, ((com.sam_chordas.android.stockhawk.data.QuoteColumns.SYMBOL) + " = ?"), new java.lang.String[]{ args.getString(getResources().getString(R.string.string_symbol)) }, null);
}