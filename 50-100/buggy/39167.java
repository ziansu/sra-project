protected void setUpActionbar() {
    final android.support.v7.widget.Toolbar actionBar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.actionbar)));
    actionBar.setBackgroundResource(R.color.colorPrimary);
    actionBar.setVisibility(View.VISIBLE);
    setSupportActionBar(actionBar);
    de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailActivity.getSupportActionBar().setElevation(de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailActivity.getResources().getDimension(R.dimen.actionbar_elevation));
}