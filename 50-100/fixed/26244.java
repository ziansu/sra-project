public void setAuthorIndex(int index) {
    if (index >= 0) {
        currentSelectedAuthor = am.findAllAuthors().get(index);
        books = bm.findBooksByAuthor(currentSelectedAuthor);
        rowCount = books.size();
    }else {
        currentSelectedAuthor = null;
        books = null;
        rowCount = 0;
    }
    fireTableDataChanged();
}