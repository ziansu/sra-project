void popForSwipeBack() {
    mLocking = true;
    mFragmentation.back(getFragmentManager(), true);
    mLocking = false;
}