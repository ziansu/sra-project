private T getViewForPosition(int position) {
    if ((mViews) == null) {
        this.mViews = initViews();
    }
    if ((position < 0) || (position > ((mViews.length) - 1))) {
        return null;
    }
    T currentView = mViews[position];
    if (currentView == null) {
        currentView = getWeekSlide(position, mWeeks);
        mViews[position] = currentView;
    }
    return currentView;
}