@java.lang.Override
public void onLoaderReset(android.content.Loader<java.util.List<io.volcain.booklisting.model.Book>> loader) {
    if ((mAdapter) != null)
        mAdapter.clear();
    
}