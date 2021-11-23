public boolean isOOB(int x, int y) {
    return (((x < 0) || (y < 0)) || (x >= (this.panel.width))) || (y > (this.panel.height));
}