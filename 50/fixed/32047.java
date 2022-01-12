public htmlflow.elements.HtmlHead<T> linkCss(final java.lang.String href) {
    this.addChild(new htmlflow.elements.HtmlLinkCss<T>(href));
    return this;
}