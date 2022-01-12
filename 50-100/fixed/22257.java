private int measureWidth(int measureSpec) {
    int result = 0;
    int specMode = com.viewpagerindicator.MeasureSpec.getMode(measureSpec);
    int specSize = com.viewpagerindicator.MeasureSpec.getSize(measureSpec);
    if ((measureSpec != 0) && (specMode != (MeasureSpec.EXACTLY))) {
        throw new java.lang.IllegalStateException(((getClass().getSimpleName()) + " can only be used in EXACTLY mode."));
    }
    result = specSize;
    return result;
}