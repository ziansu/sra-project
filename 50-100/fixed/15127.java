@java.lang.Override
public void update(float delta) {
    super.update(delta);
    if ((slideAnimator) != null) {
        if (slideAnimator.isRunning()) {
            slideAnimator.update(delta);
            scrollAmount = slideAnimator.getAmount();
            updateWidgets();
        }
    }
}