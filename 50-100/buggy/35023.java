private void init(android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    processAttributes(attrs, defStyleAttr, defStyleRes);
    if (wasDismissedBefore()) {
        hide();
    }else {
        android.view.LayoutInflater.from(getContext()).inflate(R.layout.view_one_time_hint_view_card, this, true);
        applyAttributes();
        attachListenerToDismissButton();
    }
}