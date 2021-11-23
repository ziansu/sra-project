public void setOnFocusListener(@javax.annotation.Nullable
final com.facebook.react.views.picker.ReactPicker.OnFocusListener onFocusListener) {
    mOnFocusListener = onFocusListener;
    if (onFocusListener != null) {
        setFocusableInTouchMode(true);
        clearFocus();
    }else {
        setFocusableInTouchMode(false);
        clearFocus();
    }
    setOnFocusChangeListener(new com.facebook.react.views.picker.OnFocusChangeListener() {
        @java.lang.Override
        public void onFocusChange(android.view.View v, boolean hasFocus) {
            if (onFocusListener != null) {
                if (hasFocus) {
                    performClick();
                }
                mHasFocus = hasFocus;
                onFocusListener.onFocusChanged(hasFocus);
            }
        }
    });
}