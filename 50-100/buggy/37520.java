private void initializeView(android.util.AttributeSet attrs, int defStyleAttr) {
    if ((attrs != null) && (!(isInEditMode()))) {
        final android.content.res.TypedArray attributes = mContext.getTheme().obtainStyledAttributes(attrs, R.styleable.PinCodeView, defStyleAttr, 0);
        android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
        com.ce.game.screenlocker.view.KeyboardView view = ((com.ce.game.screenlocker.view.KeyboardView) (inflater.inflate(R.layout.view_keyboard, this)));
        initKeyboardButtons(view);
    }
}