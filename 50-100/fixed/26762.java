private void resizePresentationPanel() {
    SlideshowPresenter.PresentationImagePanel.setBounds(0, menuBar.getHeight(), MainPanel.getWidth(), (((MainPanel.getHeight()) - (2 * (menuBar.getHeight()))) - (btnPrevious.getHeight())));
}