@java.lang.Override
public void loadingPanel(boolean isVisible) {
    loadingIconPanel.setVisible(isVisible);
    contentScroll.setVisible((!isVisible));
}