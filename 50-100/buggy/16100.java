public java.util.ArrayList<Book> searchByTitle(java.lang.String title) {
    java.util.ArrayList<Book> found = new java.util.ArrayList<Book>();
    for (Book bk : this.book) {
        if (StringUtils.included(this.book.get(i).title(), title)) {
            found.add(title);
        }
    }
    return found;
}