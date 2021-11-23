private void initializeView() {
    if (!(isInEditMode())) {
        android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
        com.ce.game.screenlocker.view.KeyboardView view = ((com.ce.game.screenlocker.view.KeyboardView) (inflater.inflate(R.layout.view_keyboard, this)));
        initKeyboardButtons(view);
    }
}