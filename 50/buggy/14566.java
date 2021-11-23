public java.lang.String getInformationByXpath(org.jsoup.nodes.Document doc, java.lang.String xpath) {
    java.lang.String result = us.codecraft.xsoup.Xsoup.compile(xpath).evaluate(doc).get();
    return result;
}