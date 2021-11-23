public void clearHTMLElement() {
    this.HTMLNodes.clear();
    if ((this.isDebug) == true) {
        this.inValidate();
    }
}