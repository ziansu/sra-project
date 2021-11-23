@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    com.example.prusp.booklistingappwithoutlibraries.Book[] values = new com.example.prusp.booklistingappwithoutlibraries.Book[adapter.getCount()];
    for (int i = 0; i < (values.length); i++) {
        values[i] = adapter.getItem(i);
    }
    outState.putParcelableArray(com.example.prusp.booklistingappwithoutlibraries.MainActivity.RESULTS, ((android.os.Parcelable[]) (values)));
}