private void refreshSize() {
    labelWidth = (this.getWidth()) / ((this.days.size()) + 1);
    labelHeight = (this.getHeight()) / (this.times.size());
}