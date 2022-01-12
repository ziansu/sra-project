private void init(android.util.AttributeSet attrs, int defStyleAttr) {
    android.content.res.TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.SVGView, defStyleAttr, 0);
    svgId = a.getResourceId(R.styleable.SVGView_carbon_src, 0);
    setColorFilter(a.getColorStateList(R.styleable.SVGView_carbon_filterColor));
    a.recycle();
}