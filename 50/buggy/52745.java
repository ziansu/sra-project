public void setWindowColor(java.awt.Color c) {
    if (c != null) {
        db.window.DataWindow.mainpanel.setBackground(c);
        frame.repaint();
    }
}