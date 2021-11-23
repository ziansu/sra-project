private T getViewForPosition(int position) {
    if ((mViews) == null) {
        this.mViews = initViews();
    }
    T currentView = mViews[position];
    if (currentView == null) {
        currentView = getWeekSlide(position, mWeeks);
        mViews[position] = currentView;
    }
    return currentView;
}