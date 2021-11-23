@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    nameEditText.setText("");
    priceEditText.setText("");
    quantityText.setText("0");
    suppliersEmailEditText.setText("");
    productsImageView.setImageURI(null);
}