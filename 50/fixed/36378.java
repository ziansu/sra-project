public synchronized void setText(java.lang.String text) {
    this.deleteText(0, this.getLength());
    this.appendText(text);
    this.positionCaret(0);
}