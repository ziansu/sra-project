@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (isAddCard) {
        gameView.player.getCardsQueue().addFirst(GameConstants.NOT_A_CARD);
        gameView.player.updateOneMove();
        if (!(gameView.player.getQueue().isEmpty())) {
            gameView.setupAnimations();
        }
    }else {
        cardView.setVisibility(View.INVISIBLE);
    }
    super.onAnimationEnd(animation);
}