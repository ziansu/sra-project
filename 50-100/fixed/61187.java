public static int[] askChosenCard() {
    for (int i = 0; i < (PlayGame.numOfPlayers); i++) {
        if (i == 0) {
            PlayGame.chosenCard[0] = PlayGame.playerChoose;
        }else {
            PlayGame.chosenCard[i] = PlayGame.playerList[i].choiceOneCard(PlayGame.playerList[i]);
            javax.swing.ImageIcon card = Dealer.setImage(((PlayGame.chosenCard[i]) + 1));
            PlayGame.playerLabel.get(i).setIcon(card);
        }
    }
    return PlayGame.chosenCard;
}