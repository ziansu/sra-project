private void invalidateSwipable() {
    com.alexandrepiveteau.library.tutorial.ui.fragments.ITutorialValidationFragment fragment = ((com.alexandrepiveteau.library.tutorial.ui.fragments.ITutorialValidationFragment) (mFragmentList.get(mViewPager.getCurrentItem())));
    if (fragment.isValid()) {
        mViewPager.setSwipableRight(true);
    }else {
        mViewPager.setSwipableRight(false);
    }
}