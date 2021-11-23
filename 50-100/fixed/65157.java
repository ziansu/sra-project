public void setSource(java.lang.String source) {
    if (!(this.undoMemento.empty())) {
        this.undoMemento.push(this.createMemento());
    }else {
        this.undoMemento.push(this.createMemento());
    }
    this.source = source;
    findKeywords(source);
    this.editorview.updateView();
}