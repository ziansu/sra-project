public void setLineColor(int ibar, java.awt.Color color) {
    if (!(equalColors(_lineColor[ibar], color))) {
        _lineColor[ibar] = color;
        repaint();
    }
}