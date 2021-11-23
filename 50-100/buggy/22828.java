private static java.lang.String doOnePage(java.io.File file) throws java.lang.Exception {
    org.jsoup.nodes.Document doc = org.jsoup.Jsoup.parse(file, "windows-1255", "");
    com.mycompany.app.DaatHitzoniim.log.println(doc);
    java.lang.String output = doc.body().text();
    output = com.mycompany.app.DaatHitzoniim.removeNeedlessChars(output);
    return output;
}