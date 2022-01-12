private void resizePresentationPanel() {
    SlideshowPresenter.PresentationImagePanel.setBounds(0, 10, MainPanel.getWidth(), (((MainPanel.getHeight()) - (2 * (menuBar.getHeight()))) - (btnPrevious.getHeight())));
}