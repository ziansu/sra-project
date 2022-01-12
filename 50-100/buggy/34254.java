public java.lang.String addBook(backend.Book book) {
    if (basket.contains(book)) {
        quantities.put(book, ((quantities.get(book)) + 1));
    }else {
        basket.add(book);
        quantities.put(book, 1);
    }
    if (book != null) {
        summary += book.getPrice();
    }
    return "/shoppingcart.xhtml";
}