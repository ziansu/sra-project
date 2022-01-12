private void setSideMenuWidth(final com.reactnativenavigation.views.ContentView sideMenuView) {
    sideMenuView.setOnDisplayListener(new com.reactnativenavigation.screens.Screen.OnDisplayListener() {
        @java.lang.Override
        public void onDisplay() {
            android.view.ViewGroup.LayoutParams layoutParams = sideMenuView.getLayoutParams();
            if ((width) >= 0) {
                layoutParams.width = ((int) ((width) * (getResources().getDisplayMetrics().density)));
            }else {
                layoutParams.width = sideMenuView.getChildAt(0).getWidth();
            }
            sideMenuView.setLayoutParams(layoutParams);
        }
    });
}