public void PlayTurnComputer() {
    boolean cont = false;
    while (cont == false) {
        int i = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, (8 + 1));
        if ((!(board[i].equals(business.layer.PlayService.playerChar.O))) || (!(board[i].equals(business.layer.PlayService.playerChar.X)))) {
            board[i] = currentPlayer.toString();
            cont = true;
        }
    } 
    int res = results();
}