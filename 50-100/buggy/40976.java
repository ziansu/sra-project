public void onDestroy() {
    iconOpenedDrawable = null;
    iconClosedDrawable = null;
    for (int i = 0; i < 5; i++) {
        animator[i] = null;
    }
    animator = null;
    button = null;
    onClickListener = null;
}