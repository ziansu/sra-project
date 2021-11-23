public java.util.List<edu.mtholyoke.cs341bd.bookz.GutenbergBook> getBooksStartingWithTitles(java.lang.String myTitle) {
    java.util.List<edu.mtholyoke.cs341bd.bookz.GutenbergBook> matches = new java.util.ArrayList<>(10000);
    for (edu.mtholyoke.cs341bd.bookz.GutenbergBook book : library.values()) {
        java.lang.String first = book.title.toLowerCase();
        if (first.contains(myTitle.toLowerCase())) {
            matches.add(book);
        }
    }
    return matches;
}