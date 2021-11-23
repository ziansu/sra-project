@java.lang.Override
public void onSelectedCardChange(com.ten.hanabi.ui.play.Player player, int pos) {
    if ((cardSelectedHere) >= 0) {
        int previousSelectedCard = cardSelectedHere;
        cardSelectedHere = -1;
        cardBorder(previousSelectedCard);
    }
    if (player == (this.player)) {
        this.cardSelectedHere = pos;
        cardBorder(pos);
    }
}