@java.lang.Override
public void onClick(android.view.View v) {
    final android.view.View rootView = getView();
    if ((mItem) != null) {
        mItem.set(mItem.getOriginal());
        setViews(rootView, mItem);
    }
}