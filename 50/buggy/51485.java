public void addItems(java.util.List<com.gaborbiro.bookapidemo.provider.books.Book> moreItems) {
    mProgressIndicatorVisible = false;
    int oldSize = mBooks.size();
    mBooks.addAll(moreItems);
    notifyItemRangeInserted(oldSize, moreItems.size());
}