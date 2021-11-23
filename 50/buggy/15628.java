@android.support.annotation.NonNull
private java.lang.String getAuthor(org.jsoup.nodes.Document document) {
    org.jsoup.select.Elements author = document.select("div#content div b");
    if (author.isEmpty()) {
        return "";
    }else {
        return author.first().ownText();
    }
}