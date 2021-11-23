@java.lang.Override
public java.util.List<com.example.android.booklisting.Book> loadInBackground() {
    if ((mUrl) == null) {
        return null;
    }
    return com.example.android.booklisting.QueryUtils.fetchBookData(mUrl);
}