@java.lang.Override
public java.lang.Object getValueAt(int rowIndex, int columnIndex) {
    cz.muni.fi.pv168.library.backend.Book book = bookManager.findAllBooks().get(rowIndex);
    switch (columnIndex) {
        case 0 :
            return book.getId();
        case 1 :
            return book.getName();
        case 2 :
            return book.getAuthor();
        case 3 :
            return book.getGenre();
        default :
            throw new java.lang.IllegalArgumentException("columnIndex");
    }
}