public boolean fullHouse() {
    if ((this.pair()) && (this.threeOfAKind())) {
        return true;
    }
    return false;
}