public void processAttributes(android.content.res.TypedArray arr) {
    if (arr == null)
        return ;
    
    if (arr.hasValue(R.styleable.TitleSpinner_digits)) {
        setDigits(arr.getInt(R.styleable.TitleSpinner_digits, digits));
    }
    if (arr.hasValue(R.styleable.TitleSpinner_min_val)) {
        minValue = arr.getInt(R.styleable.TitleSpinner_min_val, minValue);
    }
    if (arr.hasValue(R.styleable.TitleSpinner_max_val)) {
        maxValue = arr.getInt(R.styleable.TitleSpinner_max_val, maxValue);
    }
}