public static gh.funthomas424242.webapp.books.domain.ISBN parseFromString(final java.lang.String isbnraw) throws gh.funthomas424242.webapp.books.domain.InvalidISBNException {
    final java.lang.String isbnNumbers = gh.funthomas424242.webapp.books.domain.ISBN.extractNumbers(isbnraw);
    gh.funthomas424242.webapp.books.domain.ISBN isbn = null;
    if ((isbnNumbers.length()) <= 10) {
        isbn = new gh.funthomas424242.webapp.books.domain.ISBN10(isbnNumbers, isbnraw);
    }else {
        isbn = new gh.funthomas424242.webapp.books.domain.ISBN(isbnNumbers, isbnraw);
    }
    return isbn;
}