public void init(android.util.AttributeSet attrs) {
    try {
        setWillNotDraw(false);
        if (attrs != null)
            setupAttributes(attrs);
        
        setGravity(Gravity.CENTER);
        setupAnimators();
        setupPaint();
    } catch (java.lang.Exception ignored) {
    }
}