private java.lang.String convertHtml(java.lang.String title) {
    com.google.gwt.user.client.ui.HTML html = new com.google.gwt.user.client.ui.HTML();
    html.setHTML(title);
    return html.getHTML();
}