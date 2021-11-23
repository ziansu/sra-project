public void attachToView(android.view.ViewGroup parent) {
    if ((getView().getParent()) == parent) {
        return ;
    }
    if ((getView().getParent()) != null) {
        ((android.view.ViewGroup) (getView().getParent())).removeView(getView());
    }
    parent.addView(getView());
    updateView();
}