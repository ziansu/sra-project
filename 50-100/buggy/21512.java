@java.lang.Override
protected void onResume() {
    super.onResume();
    loadAppsAsyncTask(true);
    if (getIntent().hasExtra(AppCategoryDetailFragment.ARG_ITEM_CONTENT)) {
        displayView(getIntent().getStringExtra(AppCategoryDetailFragment.ARG_ITEM_CONTENT), 1);
    }else
        displayView("Uncategorised", 1);
    
    drawerFragment.openDrawer();
}