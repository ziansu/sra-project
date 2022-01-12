boolean charge(int x, int y, int power) {
    this.power += power;
    if ((this.last) < power) {
        this.x = x;
        this.y = y;
        this.last = power;
        return true;
    }
    return false;
}