private void showMoreBooks(int itemsPerPage) {
    int start = lessBooks.size();
    int end = start + itemsPerPage;
    for (int i = start; i < end; i++) {
        lessBooks.add(books.get(i));
    }
}