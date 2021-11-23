@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<viktorkhon.com.udacity_project_7_booklistingapp.Book>> loader, java.util.List<viktorkhon.com.udacity_project_7_booklistingapp.Book> data) {
    mBookAdapter.clear();
    mProgressBar1.setVisibility(View.GONE);
    android.util.Log.i(viktorkhon.com.udacity_project_7_booklistingapp.MainActivity.LOG_TAG, "onLoadFinished for emplty view");
    emptyView.setText("No books found");
    if ((data != null) && (!(data.isEmpty()))) {
        mBookAdapter.addAll(data);
        bookListView.setAdapter(mBookAdapter);
    }
}