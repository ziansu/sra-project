public static com.roughike.bottombar.BottomBar attachShy(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View userContentView, android.os.Bundle savedInstanceState) {
    final com.roughike.bottombar.BottomBar bottomBar = new com.roughike.bottombar.BottomBar(coordinatorLayout.getContext());
    bottomBar.toughChildHood(android.support.v4.view.ViewCompat.getFitsSystemWindows(coordinatorLayout));
    bottomBar.onRestoreInstanceState(savedInstanceState);
    if ((userContentView != null) && (coordinatorLayout.getContext().getResources().getBoolean(R.bool.bb_bottom_bar_is_tablet_mode))) {
        bottomBar.setPendingUserContentView(userContentView);
    }
    coordinatorLayout.addView(bottomBar);
    return bottomBar;
}