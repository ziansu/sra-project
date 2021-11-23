public void updateFrame() {
    this.removeAll();
    this.addAllFilesAsJLabels();
    frame.setResizable(false);
    frame.revalidate();
    frame.repaint();
    frame.setResizable(true);
    repaint();
}