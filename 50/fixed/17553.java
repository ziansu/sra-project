public boolean addBook(java.lang.String isbn, java.lang.String title, java.lang.String maxCheckoutLength, java.lang.String numOfcopies, business.Author[] authors) throws exception.LibrarySystemException {
    return addBook(isbn, title, java.lang.Integer.parseInt(maxCheckoutLength), java.lang.Integer.parseInt(numOfcopies), java.util.Arrays.asList(authors));
}