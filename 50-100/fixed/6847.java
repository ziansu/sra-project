private void processAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    android.content.res.TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ColorButton);
    final int N = a.getIndexCount();
    for (int i = 0; i < N; ++i) {
        int attr = a.getIndex(i);
        if (attr == (R.styleable.ColorButton_jr_color)) {
            mColor = a.getColor(attr, 0);
            colorify();
            break;
        }
    }
    a.recycle();
}