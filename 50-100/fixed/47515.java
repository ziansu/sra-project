private java.util.ArrayList<com.springapp.mvc.model.Book> sortBooks(java.lang.String order, java.util.ArrayList<com.springapp.mvc.model.Book> books, boolean ascending) {
    if (order.equals("Title")) {
        if (ascending == true) {
            java.util.Collections.sort(books, new com.springapp.mvc.model.BookComparator.BookComparatorDescending());
        }else {
            java.util.Collections.sort(books, new com.springapp.mvc.model.BookComparator.BookComparatorAscending());
        }
    }
    return books;
}