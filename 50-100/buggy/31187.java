public boolean collision(int x, int y, int w, int h) {
    if ((((y + h) > (this.y)) && (y < ((this.y) + (sizeY)))) && (((x + w) > (this.x)) && (x < ((this.x) + (sizeX))))) {
        return true;
    }
    return false;
}