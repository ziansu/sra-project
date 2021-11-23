@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    android.view.View v = ((android.view.View) (((android.animation.ObjectAnimator) (animation)).getTarget()));
    if ((v.getY()) == (_minY)) {
        com.gradians.prepwell.dom.Deck current = com.gradians.prepwell.dom.Dealer.getCurrentDeck();
        com.gradians.prepwell.gui.PlaypenControls controls = com.gradians.prepwell.dom.Dealer.getContext().getControls();
        controls.showFor(current);
    }
}