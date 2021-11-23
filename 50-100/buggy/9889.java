private void clearFields() {
    bookTitle.setText("");
    bookSubtitle.setText("");
    authorsText.setText("");
    categoriesText.setText("");
    bookContainer.setVisibility(View.INVISIBLE);
    scanButton.setVisibility(View.VISIBLE);
    if (it.jaschke.alexandria.activities.MainActivity.IS_TABLET) {
        saveButton.setVisibility(View.INVISIBLE);
        deleteButton.setVisibility(View.INVISIBLE);
    }else {
        saveButton.setVisibility(View.GONE);
        deleteButton.setVisibility(View.GONE);
    }
}