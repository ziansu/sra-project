public void showArticleBar() {
    if ((bottomBar.getVisibility()) != (android.widget.RelativeLayout.VISIBLE)) {
        bottomBar.setVisibility(View.VISIBLE);
        if (!(isLandscape))
            mAdView.animate().x(xOfAdView);
        
    }
}