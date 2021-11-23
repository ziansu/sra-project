public void setActiveData(es.uvigo.ei.aibench.core.clipboard.ClipboardItem data) {
    if ((this.activeItem) != data) {
        this.activeItem = data;
    }
    this.mainWindow.bringToFront(data);
}