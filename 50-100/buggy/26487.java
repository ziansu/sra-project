private void invalidateSwipable() {
    com.alexandrepiveteau.library.tutorial.ui.fragments.ITutorialValidationFragment fragment = ((com.alexandrepiveteau.library.tutorial.ui.fragments.ITutorialValidationFragment) (mFragmentList.get(mViewPager.getCurrentItem())));
    android.util.Log.d("Content", ((("invalidateSwipable := " + fragment) + " ") + (fragment.isValid())));
    if (fragment.isValid()) {
        mViewPager.setSwipableRight(true);
    }else {
        mViewPager.setSwipableRight(false);
    }
}