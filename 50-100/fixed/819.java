public voronoigame.view.ContentPanel removeContent() {
    this.pmContentContainer.setVisible(false);
    if ((this.contentPanel) != null) {
        this.pmContentContainer.remove(this.contentPanel);
        voronoigame.view.ContentPanel removed = this.contentPanel;
        this.contentPanel = null;
        removed.notifyPanelRemoved();
        return removed;
    }else {
        return null;
    }
}