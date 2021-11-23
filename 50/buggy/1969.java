private boolean linearCollideVertical() {
    if ((verticalCollideIsElligible()) && ((operatorLeft) == (sliderLeft))) {
        android.util.Log.d(karavangelos.com.operator.gameparts.Slider.TAG, "VERTICAL COLLIDE");
        return true;
    }
    return false;
}