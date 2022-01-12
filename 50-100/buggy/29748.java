@java.lang.Override
public void onClick(android.view.View view) {
    if (mAmount > 0) {
        android.net.Uri uri = android.content.ContentUris.withAppendedId(GoodsEntry.CONTENT_URI, (mId + 1));
        android.content.ContentValues values = new android.content.ContentValues();
        values.put(GoodsEntry.COLUMN_GOODS_AMOUNT, (mAmount - 1));
        values.put(GoodsEntry.COLUMN_SALES_VOLUME, (mSalesVolume + 1));
        int rowsAffected = context.getContentResolver().update(uri, values, null, null);
    }
}