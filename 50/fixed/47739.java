private void hitProcess(io.zipcoder.zealotscasino.Player player) {
    boolean hit = checkIfPlayerHit();
    while (hit) {
        takeHit();
        hit = checkStatus(player);
        if (hit) {
            hit = checkIfPlayerHit();
        }
    } 
}