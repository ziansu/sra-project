private void refreshWindowContent() {
    getContentPane().removeAll();
    colNamesTextFieldsToColNames();
    initMenuePanel();
    initContentPanel();
    getContentPane().revalidate();
    getContentPane().repaint();
    setVisible(true);
}