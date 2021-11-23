protected void initData() {
    borrowBook("foo", bookDao.getRandomUnborrowedBook().getBookId());
    borrowBook("foo", bookDao.getRandomUnborrowedBook().getBookId());
    borrowBook("11310057", bookDao.getRandomUnborrowedBook().getBookId());
    borrowBook("11310057", bookDao.getRandomUnborrowedBook().getBookId());
    borrowBook("admin", bookDao.getRandomUnborrowedBook().getBookId());
}