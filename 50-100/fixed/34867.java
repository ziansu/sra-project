@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<viktorkhon.com.udacity_project_7_booklistingapp.Book>> loader, java.util.List<viktorkhon.com.udacity_project_7_booklistingapp.Book> data) {
    mBookAdapter.clear();
    mProgressBar1.setVisibility(View.GONE);
    if ((data != null) && (!(data.isEmpty()))) {
        mBookAdapter.addAll(data);
        bookListView.setAdapter(mBookAdapter);
    }
}