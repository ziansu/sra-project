public void solve(int nb, int source, int destination, int auxiliary) throws hanoi.TowerIsEmptyException, hanoi.TowerIsFullException {
    if (nb == 1) {
        this.moveOneDisc(source, destination);
    }else {
        this.solve((nb - 1), source, auxiliary, destination);
        this.moveOneDisc(source, destination);
        this.solve((nb - 1), auxiliary, destination, source);
    }
}