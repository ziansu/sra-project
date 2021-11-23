@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    holder.mNameEditText.setText("");
    holder.mAmountEditText.setText("");
    holder.mPriceEditText.setText("");
    holder.mSalesVolume.setText("");
    holder.mAddAmountEditText.setText(java.lang.String.valueOf(0));
    holder.mCutBackAmountEditText.setText(java.lang.String.valueOf(0));
}