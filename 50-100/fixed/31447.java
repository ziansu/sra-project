@java.lang.Override
public void onSlide(@android.support.annotation.NonNull
android.view.View bottomSheet, float slideOffset) {
    int allHeight = ((android.view.View) (bottomSheet.getParent())).getHeight();
    int visibleHeight = ((int) ((bottomSheet.getHeight()) * slideOffset));
    android.support.design.widget.CoordinatorLayout.LayoutParams params = ((android.support.design.widget.CoordinatorLayout.LayoutParams) (newPostFragmentView.getLayoutParams()));
    params.height = allHeight - visibleHeight;
    newPostFragmentView.setLayoutParams(params);
}