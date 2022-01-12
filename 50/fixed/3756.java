public void updateFrame() {
    this.removeAll();
    this.addAllFilesAsJLabels();
    frame.revalidate();
    frame.repaint();
    repaint();
}