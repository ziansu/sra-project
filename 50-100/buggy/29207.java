private boolean isLastViewVisible() {
    android.view.View lastChild = getChildAt((((((getCount()) - 1) - (getFirstVisiblePosition())) - (getHeaderViewsCount())) - (getFooterViewsCount())));
    if (lastChild == null) {
        return false;
    }else {
        return ((headerLayoutParams.height) == (heightOfHeader)) && ((lastChild.getBottom()) <= (getBottom()));
    }
}