public void save() {
    if ((this.handler) != null) {
        this.handler.onTextSave(getValue());
    }
}