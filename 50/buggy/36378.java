public synchronized void setText(java.lang.String text) {
    this.deleteText(0, ((this.getLength()) - 1));
    this.appendText(text);
    this.positionCaret(0);
}