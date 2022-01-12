@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if (!(suppressOnPageChangeListeners)) {
        original.onPageScrolled(reverse(position), (-positionOffset), positionOffsetPixels);
    }
}