public void setView() {
    setTextColor((fullMode ? android.graphics.Color.WHITE : color));
    setGravity(Gravity.CENTER);
    setLayoutParams(new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
}