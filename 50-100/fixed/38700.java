@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    holder.mNameEditText.setText(null);
    holder.mAmountEditText.setText(null);
    holder.mPriceEditText.setText(null);
    holder.mSalesVolume.setText(null);
    holder.mAddAmountEditText.setText(java.lang.String.valueOf(0));
    holder.mCutBackAmountEditText.setText(java.lang.String.valueOf(0));
}