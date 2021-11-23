@java.lang.Override
public void move() {
    if ((countdown) > 0) {
        countdown -= monsterspeed;
        return ;
    }
    if ((skilltimer) > 0) {
        skilltimer -= 1;
    }
    setCell(calculateDistance(this.currentCell, player.currentCell));
    destinationCell = null;
    if ((visibleCountdown) > 0) {
        visibleCountdown -= 1;
    }
    if ((visibleCountdown) == 0) {
        isVisible = true;
    }
}