public void setRightIcon5(int drawableRes) {
    if ((rightIcon5View) == null) {
        rightIcon5View = ((android.widget.ImageButton) (rightIcon5ViewStub.inflate()));
    }
    rightIcon5View.setImageResource(drawableRes);
}