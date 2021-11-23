public htmlflow.elements.HtmlHead<T> title(java.lang.String msg) {
    addChild(new htmlflow.elements.HtmlTitle<T>()).text(msg);
    return this;
}