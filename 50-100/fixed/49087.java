@java.lang.Override
public void run() {
    pager = pagecontainer.getViewPager();
    pageAdapter = new com.vinmein.dvadivel.foodie.fragment.homeFragment.MyPagerAdapter(getActivity().getApplicationContext(), mData);
    pager.setAdapter(pageAdapter);
    pager.setClipChildren(false);
    pager.setOffscreenPageLimit(15);
}