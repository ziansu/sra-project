public void setLevel(int level) {
    int oldLevel = this.level;
    this.level = level;
    this.firePropertyChange("level", oldLevel, this.level);
    repaint();
}