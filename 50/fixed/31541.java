@java.lang.Override
public void hearShake() {
    countOfCards += 5;
    emailCardView.setAlpha(1);
    background_error.animate().alpha(0).start();
    getNewCard();
}