@java.lang.Override
public void removeRecyclerViewFromView() {
    android.view.ViewGroup parent = ((android.view.ViewGroup) (mContainer.getChildAt(0)));
    parent.removeViewAt(1);
}