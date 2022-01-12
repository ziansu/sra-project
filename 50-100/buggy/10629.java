private void init(android.util.AttributeSet attrs, int defStyleAttr) {
    android.content.res.TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.SVGView, defStyleAttr, 0);
    svgId = a.getResourceId(R.styleable.SVGView_carbon_src, 0);
    filterColor = a.getColorStateList(R.styleable.SVGView_carbon_filterColor);
    if ((filterColor) != null)
        setColorFilter(new android.graphics.LightingColorFilter(0, filterColor.getColorForState(getDrawableState(), filterColor.getDefaultColor())));
    
    a.recycle();
}