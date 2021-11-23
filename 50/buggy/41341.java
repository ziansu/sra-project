public int getShotCost() {
    return isForNextPlayer() ? (shotCost) * 2 : shotCost;
}