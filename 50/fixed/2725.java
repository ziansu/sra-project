public void addNewspaper(java.lang.String title, java.lang.String publisher, int issueNumber, java.lang.String genre, double price) {
    register.addLiterature(new Newspaper(title, publisher, issueNumber, genre, price));
}