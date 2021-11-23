@java.lang.Override
public void onTick(long millisUntilFinished) {
    refresh.setRotation((1 * ((i)++)));
    refresh.invalidate();
}