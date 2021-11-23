@java.lang.Override
public void onGlobalLayout() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
        currentHeader.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }else {
        currentHeader.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
    int newDimen = currentDimension();
    if ((headerHasTranslation()) && ((previous) != newDimen)) {
        updateTranslation(((previous) - newDimen));
    }
}