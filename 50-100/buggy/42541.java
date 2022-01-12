private void fillPageNumbers(long totalBooksCount, int booksCountOnPage) {
    int pageCount = (totalBooksCount > 0) ? ((int) (totalBooksCount / booksCountOnPage)) : 0;
    pageNumbers.clear();
    for (int i = 1; i <= pageCount; i++) {
        pageNumbers.add(i);
    }
}