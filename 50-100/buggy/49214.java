private java.lang.String article(org.jsoup.nodes.Document document) throws parser.ParserException {
    java.lang.String field = "[Article] ";
    org.jsoup.nodes.Element element = document.getElementById("zwconbody");
    checkUnique(element, (field + "Id zwconbody is not 1."));
    java.lang.String article = element.text().trim();
    if (article.isEmpty()) {
        throw new parser.ParserException((field + "Cannot find article."));
    }
    return article;
}