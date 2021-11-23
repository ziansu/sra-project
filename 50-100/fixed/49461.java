private void updateUi(java.util.List<com.example.prusp.booklistingappwithoutlibraries.Book> books) {
    adapter.clear();
    if (books.isEmpty()) {
        noDataTextView.setVisibility(View.VISIBLE);
    }else {
        noDataTextView.setVisibility(View.GONE);
        adapter.addAll(books);
    }
}