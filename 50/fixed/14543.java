public void addItem(com.quartzodev.data.BookApi bookApi) {
    if (((mBookList) != null) && (!(mBookList.contains(bookApi)))) {
        mBookList.add(bookApi);
        notifyDataSetChanged();
    }
}