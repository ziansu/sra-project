protected void setUpActionbar() {
    final android.support.v7.widget.Toolbar actionBar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.actionbar)));
    actionBar.setBackgroundResource(R.color.colorPrimary);
    actionBar.setVisibility(View.VISIBLE);
    setSupportActionBar(actionBar);
    getSupportActionBar().setElevation(getResources().getDimension(R.dimen.actionbar_elevation));
}