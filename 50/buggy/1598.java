protected void setLightAt(int x, int y, int val) {
    this.grid.setLightAt(x, y, val);
    this.view.updateCell(this.grid.get(x, y));
}