public void setSource(java.lang.String source) {
    if (!(this.undoMemento.empty())) {
        if (!(this.undoMemento.peek().getSource().equals(source))) {
            this.undoMemento.push(this.createMemento());
        }
    }else {
        this.undoMemento.push(this.createMemento());
    }
    this.source = source;
    findKeywords(source);
    this.editorview.updateView();
}