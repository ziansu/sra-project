public void parseTypeOfTextItem(agh.cs.lab8.Document doc) {
    switch (commands[1]) {
        case "-all" :
            showAll(doc);
            break;
        case "-c" :
            showChapters(doc);
            break;
        case "-a" :
            showArticles(doc);
        default :
            throw new java.lang.IllegalArgumentException("Incorrect argument. Use -all for whole document, -c for chapters, -a for articles.");
    }
}