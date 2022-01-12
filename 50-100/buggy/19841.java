protected void updateControls() {
    android.graphics.drawable.Drawable icon;
    if ((getCurrentState()) == (State.STARTED)) {
        icon = context.getResources().getDrawable(R.drawable.fvl_selector_pause);
    }else {
        icon = context.getResources().getDrawable(R.drawable.fvl_selector_play);
    }
    imgplay.setBackgroundDrawable(icon);
}