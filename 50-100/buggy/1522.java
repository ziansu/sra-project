boolean charge(int x, int y, int power) {
    this.power += power;
    if ((this.last) < power) {
        this.x = x;
        this.y = y;
        return true;
    }
    return false;
}