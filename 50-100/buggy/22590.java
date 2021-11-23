@java.lang.SuppressWarnings(value = "ConstantConditions")
private void initViews() {
    java.util.List<android.view.View> pageList = createPageList();
    com.rd.pageindicatorview.home.HomeAdapter adapter = new com.rd.pageindicatorview.home.HomeAdapter();
    adapter.setData(pageList);
    android.support.v4.view.ViewPager pager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewPager)));
    pager.setAdapter(adapter);
    com.rd.PageIndicatorView pageIndicatorView = ((com.rd.PageIndicatorView) (findViewById(R.id.pageIndicatorView)));
    pageIndicatorView.setViewPager(pager);
}