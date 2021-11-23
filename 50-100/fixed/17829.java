@java.lang.Override
public void onDisplay() {
    android.view.ViewGroup.LayoutParams layoutParams = sideMenuView.getLayoutParams();
    if (width >= 0) {
        layoutParams.width = ((int) (width * (getResources().getDisplayMetrics().density)));
    }else {
        layoutParams.width = sideMenuView.getChildAt(0).getWidth();
    }
    sideMenuView.setLayoutParams(layoutParams);
}