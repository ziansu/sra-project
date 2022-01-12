public void buyCargo(int x, int cargoPrice) {
    if ((x * cargoPrice) < (this.money)) {
        this.cargo += x;
        this.money -= x * cargoPrice;
    }
}