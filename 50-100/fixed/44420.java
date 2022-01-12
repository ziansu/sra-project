private void updateUI() {
    com.smartjinyu.mybookshelf.BookLab bookLab = com.smartjinyu.mybookshelf.BookLab.get(getActivity());
    java.util.List<com.smartjinyu.mybookshelf.Book> books = bookLab.getBooks();
    if ((mAdapter) == null) {
        mAdapter = new com.smartjinyu.mybookshelf.BookListFragment.BookAdapter(books);
        mRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.setBooks(books);
        mAdapter.notifyDataSetChanged();
    }
}