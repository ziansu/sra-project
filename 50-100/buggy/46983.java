public void setupToolbar(boolean homeAsUp, android.support.v7.widget.Toolbar toolbar) {
    setSupportActionBar(toolbar);
    toolbar.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(this, com.vlad1m1r.baselibrary.base.BaseMvpActivity.getColorFromAttr(this, R.attr.colorPrimary)));
    toolbar.setTitleTextColor(android.support.v4.content.ContextCompat.getColor(this, com.vlad1m1r.baselibrary.base.BaseMvpActivity.getColorFromAttr(this, R.attr.titleTextColor)));
    if ((com.vlad1m1r.baselibrary.base.BaseMvpActivity.getSupportActionBar()) != null)
        com.vlad1m1r.baselibrary.base.BaseMvpActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(homeAsUp);
    
}