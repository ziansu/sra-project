@java.lang.Override
public void onSlideChanged() {
    setSwipeLock(((pager.getCurrentItem()) == 2));
}