@java.lang.SuppressWarnings(value = "unchecked")
private java.lang.Object preprocess(java.lang.Object content, org.rapidoid.http.HttpExchange x) {
    if (content instanceof org.rapidoid.html.TagWidget<?>) {
        org.rapidoid.html.TagWidget<org.rapidoid.http.HttpExchange> widget = ((org.rapidoid.html.TagWidget<org.rapidoid.http.HttpExchange>) (content));
        content = widget.toTag(x);
        if (content == null) {
            return null;
        }
    }
    if (!(content instanceof org.rapidoid.html.Tag)) {
        content = org.rapidoid.pages.Pages.page(x, content);
    }
    return content;
}