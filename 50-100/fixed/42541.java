private void fillPageNumbers(long totalBooksCount, int booksCountOnPage) {
    int pageCount = (booksCountOnPage > 0) ? ((int) ((totalBooksCount / booksCountOnPage) + 1)) : 0;
    pageNumbers.clear();
    for (int i = 1; i <= pageCount; i++) {
        pageNumbers.add(i);
    }
}