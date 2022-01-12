private void ValidateBook(java.lang.String isbn, library.Book book) {
    if (isbn != (book.getIsbn())) {
        throw new javax.validation.ConstraintViolationException("ISBN does not match book's ISBN.", null);
    }
    library.BooksResource.validator.validate(book);
    java.util.Set<javax.validation.ConstraintViolation<library.Book>> errors = library.BooksResource.validator.validate(book);
    if ((errors.size()) > 0) {
        throw new javax.validation.ConstraintViolationException(errors);
    }
}