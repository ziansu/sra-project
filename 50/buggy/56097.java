public void setStartIndex(com.intellij.openapi.editor.Document document) {
    this.startIndex = (document.getLineStartOffset(this.line)) + (this.startCol);
}