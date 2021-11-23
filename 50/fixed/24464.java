public htmlflow.elements.HtmlHead<T> scriptLink(final java.lang.String src) {
    this.addChild(new htmlflow.elements.HtmlScriptLink<T>(src));
    return this;
}