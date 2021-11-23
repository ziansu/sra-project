public java.util.List<edu.mtholyoke.cs341bd.bookz.GutenbergBook> getBooksStartingWithAuthor(java.lang.String author) {
    java.util.List<edu.mtholyoke.cs341bd.bookz.GutenbergBook> matches = new java.util.ArrayList<>(20);
    for (edu.mtholyoke.cs341bd.bookz.GutenbergBook book : library.values()) {
        java.lang.String first;
        if ((book.creator) != null) {
            first = book.creator.toLowerCase();
            if (first.contains(author)) {
                matches.add(book);
            }
        }
    }
    return matches;
}