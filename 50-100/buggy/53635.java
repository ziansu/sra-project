@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup collection, int position) {
    T currentView;
    if ((mViews.length) > position) {
        currentView = getViewForPosition(position);
    }else {
        return null;
    }
    collection.addView(currentView);
    return currentView;
}