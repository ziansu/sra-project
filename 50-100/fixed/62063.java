private void createSearchView(java.lang.String viewName) {
    views.View localView = ((views.View) (myViews.get(viewName)));
    if (localView == null) {
        localView = views.ViewFactory.createView(viewName, this);
        myViews.put(viewName, localView);
        swapToView(localView);
    }else {
        swapToView(localView);
    }
}