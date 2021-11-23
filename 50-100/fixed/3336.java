public void collapsedAppBar() {
    android.support.design.widget.CollapsingToolbarLayout collapsingToolbarLayout = ((android.support.design.widget.CollapsingToolbarLayout) (getLayoutInflater().inflate(R.layout.collapsing_toolbar, null)));
    collapsingToolbarLayout.setTitle("SomeTitle");
    collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
    appBarLayout.removeViewAt(0);
    appBarLayout.addView(collapsingToolbarLayout);
    setActionBar(((android.support.v7.widget.Toolbar) (collapsingToolbarLayout.getChildAt(1))));
}