@java.lang.Override
public void update(float delta) {
    super.update(delta);
    for (com.desitum.castleWars.libraries.menu.PopupWidget widget : widgets) {
        widget.update(delta);
    }
    if ((slideAnimator) != null) {
        if (slideAnimator.isRunning()) {
            slideAnimator.update(delta);
            scrollAmount = slideAnimator.getAmount();
            updateWidgets();
        }
    }
}