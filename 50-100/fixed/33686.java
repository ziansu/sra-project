@java.lang.Override
protected void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    super.initAttributes(context, attrs);
    if (attrs != null) {
        android.content.res.TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Button);
        if (a == null) {
            return ;
        }
        try {
            setClickable(a.getBoolean(R.styleable.Button_android_clickable, true));
            setFocusable(a.getBoolean(R.styleable.Button_android_focusable, true));
        } finally {
            a.recycle();
        }
    }
}