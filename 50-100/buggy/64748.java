@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public model.Book checkOut(java.lang.String name) {
    model.Book book = bookDAO.getBookByName(name);
    if (book.equals(new model.Book("", ""))) {
        return book;
    }
    book.setCheckedOut(true);
    book.setCheckOutTime(new org.joda.time.DateTime(org.joda.time.DateTimeZone.UTC).getMillis());
    bookDAO.update(book);
    return book;
}