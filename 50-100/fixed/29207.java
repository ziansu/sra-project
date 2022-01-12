private boolean isLastViewVisible() {
    android.view.View lastChild = getChildAt((((getCount()) - 1) - (getFirstVisiblePosition())));
    if (lastChild == null) {
        return false;
    }else {
        return (lastChild.getBottom()) <= (getBottom());
    }
}