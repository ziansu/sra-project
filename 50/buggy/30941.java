@java.lang.Override
public com.fuzz.indicator.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) {
    com.fuzz.indicator.CutoutViewLayoutParams params = new com.fuzz.indicator.CutoutViewLayoutParams(defaultChildParams);
    params.init(getContext(), attrs);
    return params;
}