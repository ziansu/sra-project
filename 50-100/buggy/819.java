public voronoigame.view.ContentPanel removeContent() {
    if ((this.contentPanel) != null) {
        this.pmContentContainer.remove(this.contentPanel);
        this.contentPanel.notifyPanelRemoved();
        this.contentPanel.setVisible(false);
        voronoigame.view.ContentPanel removed = this.contentPanel;
        this.contentPanel = null;
        return removed;
    }else {
        return null;
    }
}