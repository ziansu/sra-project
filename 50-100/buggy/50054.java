public boolean isAuthor(conference_package.User theReviewer, conference_package.Paper thePaper) {
    for (java.lang.String author : thePaper.getAuthors()) {
        java.util.ArrayList<java.lang.String> authorList = new java.util.ArrayList<java.lang.String>();
        authorList.addAll(thePaper.getAuthors());
        for (java.lang.String author : authorList) {
            if (theReviewer.getEmail().equalsIgnoreCase(author)) {
                return true;
            }
        }
        return false;
    }
}