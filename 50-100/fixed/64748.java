@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public model.Book checkOut(java.lang.String name) {
    model.Book book = bookDAO.getBookByName(name);
    book.setCheckedOut(true);
    book.setCheckOutTime(new org.joda.time.DateTime(org.joda.time.DateTimeZone.UTC).getMillis());
    if (!(book.equals(new model.Book("", "")))) {
        bookDAO.update(book);
    }
    return book;
}