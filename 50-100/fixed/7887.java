public void onEvent(blueprint.com.sage.events.BackEvent event) {
    if ((mViewPager.getCurrentItem()) == 0) {
        getActivity().finish();
    }else {
        mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) - 1), true);
    }
}