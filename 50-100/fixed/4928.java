public void replaceFragment(int position) {
    item = position;
    adapter = new com.example.administrator.searchpicturetool.presenter.adapter.MyPagerAdapter(getView(), fragmentManager);
    getView().getViewPager().setAdapter(adapter);
    getView().getTabLayout().setupWithViewPager(getView().getViewPager());
}