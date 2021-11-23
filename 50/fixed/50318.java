public void removeHTMLElement(java.lang.String domId) {
    this.HTMLNodes.remove(domId);
    if (this.isDebug) {
        this.inValidate();
    }
}