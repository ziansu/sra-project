public java.util.ArrayList<com.example.softspec.ebook.model.Book> searchByName(android.support.v7.widget.SearchView text) {
    searchBookList.clear();
    for (com.example.softspec.ebook.model.Book b : plan.getList()) {
        if (b.getName().contains(text.getQuery().toString())) {
            searchBookList.add(b);
        }
    }
    return searchBookList;
}