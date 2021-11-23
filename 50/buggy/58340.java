public mas.go.util.Location add(int x, int y) {
    this.x += x;
    this.y += y;
    return new mas.go.util.Location(this.x, this.y);
}