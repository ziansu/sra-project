@java.lang.Override
public void onAnimationRepeat(android.view.animation.Animation animation) {
    if (((java.lang.System.currentTimeMillis()) - (started)) < 2000)
        return ;
    
    int color = 0;
    if (currentQuestion.isCorrectlyAnswered()) {
        color = green;
    }else {
        color = red;
    }
    clicked.getBackground().setColorFilter(color, PorterDuff.Mode.MULTIPLY);
    clicked.invalidate();
}