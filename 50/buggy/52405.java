@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    nameEditText.setText("");
    breedEditText.setText("");
    weightEditText.setText(null);
    genderSpinner.setSelection(PetEntry.GENDER_UNKNOWN);
}