public boolean searchForWord(java.lang.String searchWord) {
    if ((this.htmlDocument) == null) {
        java.lang.System.out.println("ERROR! Call crawl() before performing analysis on the document");
        return false;
    }
    java.lang.System.out.println((("Searching for the word " + searchWord) + "..."));
    java.lang.String bodyText = this.htmlDocument.body().text();
    return bodyText.toLowerCase().contains(searchWord.toLowerCase());
}