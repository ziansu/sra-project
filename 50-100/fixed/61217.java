@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    if (((collapsingToolbarLayout.getHeight()) + verticalOffset) < (2 * (android.support.v4.view.ViewCompat.getMinimumHeight(collapsingToolbarLayout))))
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
    else
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
    
}