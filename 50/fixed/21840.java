public void setActiveData(es.uvigo.ei.aibench.core.clipboard.ClipboardItem data) {
    if ((this.activeItem) != data) {
        this.activeItem = data;
    }
    if ((this.activeItem) != null) {
        this.mainWindow.bringToFront(this.activeItem);
    }
}