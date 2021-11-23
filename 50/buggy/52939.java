@java.lang.Override
public void onClick(android.view.View v) {
    flagImageView.startAnimation(clkRotate);
    flagImageView.setRotation(((flagImageView.getRotation()) + 90));
}