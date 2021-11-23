private void showMoreBooks(int itemsPerPage) {
    int start = lessBooks.size();
    int end = java.lang.Math.min(((lessBooks.size()) + itemsPerPage), books.size());
    for (int i = start; i < end; i++) {
        lessBooks.add(books.get(i));
    }
}