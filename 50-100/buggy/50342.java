public void initTabView() {
    fragmentList = new java.util.ArrayList<>();
    fragmentList.add(new jeremy.com.zhihusimple.view.fragment.ZhihuFragment());
    fragmentList.add(new jeremy.com.zhihusimple.view.fragment.DailyFragment());
    fragmentList.add(new jeremy.com.zhihusimple.view.fragment.GankFragment());
    content_viewPager.setOffscreenPageLimit(3);
    content_viewPager.setAdapter(new jeremy.com.zhihusimple.presenter.adapter.MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, "main_view_pager"));
    tabLayout.setupWithViewPager(content_viewPager);
}