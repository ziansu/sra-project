public void searchByCategory(android.view.View v) {
    category = searchSpinner.getSelectedItem().toString();
    if ((category) != null) {
        new com.webwemser.letsmeetapp.MainActivity.SearchByCategoryAsync().execute();
    }
}