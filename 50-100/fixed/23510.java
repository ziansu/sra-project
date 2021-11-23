@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.example.android.booklistingapp.Book>> loader, java.util.List<com.example.android.booklistingapp.Book> books) {
    mAdapter.clear();
    if ((books != null) && (!(books.isEmpty()))) {
        mAdapter.addAll(books);
    }
}