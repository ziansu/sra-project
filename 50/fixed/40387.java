public void print(DrawFactory fac) {
    calcwidth(this.getRoot());
    fac.setLineWidth(Settings.line_size);
    rek(this.getRoot(), 0, 0, 0, Settings.height, fac);
}