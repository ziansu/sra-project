@java.lang.Override
public void select(boolean setActiveColor, int animationDuration) {
    labelView.animate().scaleX(1).scaleY(1).setDuration(animationDuration).start();
    super.select(setActiveColor, animationDuration);
}