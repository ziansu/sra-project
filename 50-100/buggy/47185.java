@org.springframework.web.bind.annotation.RequestMapping(value = "/upsert", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.rachit.bookstore.service.book.entity.Book createBook(@org.springframework.web.bind.annotation.RequestBody
com.rachit.bookstore.service.book.entity.Book book) {
    com.rachit.bookstore.service.book.entity.Book b = repository.findByTitle(book.getTitle());
    if (b != null) {
        throw new java.lang.RuntimeException("Book already exist");
    }
    com.rachit.bookstore.service.book.messaging.BookEventType eventType = ((book.getId()) == null) ? com.rachit.bookstore.service.book.messaging.BookEventType.BOOK_CREATE : com.rachit.bookstore.service.book.messaging.BookEventType.BOOK_UPDATE;
    com.rachit.bookstore.service.book.entity.Book bookUpserted = repository.save(book);
    producer.publishEvent(new com.rachit.bookstore.service.book.messaging.BookEventMessage(bookUpserted, eventType));
    return bookUpserted;
}