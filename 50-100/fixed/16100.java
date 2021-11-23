public java.util.ArrayList<Book> searchByTitle(java.lang.String title) {
    java.util.ArrayList<Book> found = new java.util.ArrayList<Book>();
    for (int i = 0; i < (this.book.size()); i++) {
        if (StringUtils.included(this.book.get(i).title(), title)) {
            found.add(this.book.get(i));
        }
    }
    return found;
}