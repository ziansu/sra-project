private com.gargoylesoftware.htmlunit.html.DomNode getKBaseResultDialog() {
    com.gargoylesoftware.htmlunit.html.HtmlElement resDialogDiv = ((com.gargoylesoftware.htmlunit.html.HtmlElement) (page.getElementById("supportedFileTypes")));
    return resDialogDiv.getParentNode().getParentNode().getParentNode();
}