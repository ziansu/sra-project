@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.example.android.booklisting.Book> books) {
    super.onPostExecute(books);
    if (books.isEmpty()) {
        updateDialog((((getResources().getString(R.string.no_results)) + " ") + (getResources().getString(R.string.suggestion))));
    }else {
        updateUI(books);
        updateDialog("");
    }
}