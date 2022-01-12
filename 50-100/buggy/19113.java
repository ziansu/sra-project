@java.lang.Override
public void onChanged() {
    if (((viewPager) != null) && ((viewPager.getAdapter()) != null)) {
        int newCount = viewPager.getAdapter().getCount();
        int currItem = viewPager.getCurrentItem();
        selectedPosition = currItem;
        selectingPosition = currItem;
        lastSelectedPosition = currItem;
        endAnimation();
        setCount(newCount);
        resetFrameValues();
        setProgress(selectingPosition, 1.0F);
    }
}