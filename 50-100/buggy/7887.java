public void onEvent(blueprint.com.sage.events.BackEvent event) {
    if ((mViewPager.getCurrentItem()) == 0) {
        blueprint.com.sage.signUp.SignUpActivity activity = ((blueprint.com.sage.signUp.SignUpActivity) (getActivity()));
        activity.finish();
    }else {
        mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) - 1), true);
    }
}