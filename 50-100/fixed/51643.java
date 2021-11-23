public java.lang.String getTextByHtml(java.lang.String html) {
    java.lang.String text = null;
    try {
        text = articleExtractor.getText(html);
    } catch (de.l3s.boilerpipe.BoilerpipeProcessingException e) {
        text = null;
    }
    if ((text == null) || (text.isEmpty())) {
        text = org.jsoup.Jsoup.parse(html).text();
    }
    if ((text == null) || (text.isEmpty())) {
        return html;
    }
    return text;
}