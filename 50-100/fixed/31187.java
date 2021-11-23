public int collision(int x, int y, int w, int h) {
    if ((((y < ((this.y) + (this.sizeY))) && ((x + w) > (this.x))) && (x < ((this.x) + (this.sizeX)))) && ((y + h) > (this.y))) {
        return 1;
    }
    return 0;
}