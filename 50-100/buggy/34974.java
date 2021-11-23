public java.lang.String drucken(Rechnung r) {
    java.lang.String result = "<table>";
    java.util.ArrayList<Artikel> articles = r.getArticleList();
    for (Artikel article : articles) {
        result += ((("<tr><td>".getBezeichnung()) + "</td><td> ") + (article.getPreis())) + "\u20ac</td></tr> \n";
    }
    result += "</table>\n";
    return result;
}