@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    mNameEditText.setText("");
    mBreedEditText.setText("");
    mWeightEditText.setText("");
    mGenderSpinner.setSelection(0);
}