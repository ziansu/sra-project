public void clearHTMLElement() {
    this.HTMLNodes.clear();
    if (this.isDebug) {
        this.inValidate();
    }
}