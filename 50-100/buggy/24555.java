public static int getRealPositon(com.zanlabs.widget.infiniteviewpager.InfiniteViewPager viewPager, int position) {
    int realAdapterSize = com.zanlabs.widget.infiniteviewpager.InfiniteViewPager.FakePositionHelper.getRealAdapterSize(viewPager);
    int startPostion = com.zanlabs.widget.infiniteviewpager.InfiniteViewPager.FakePositionHelper.getStartPosition(viewPager);
    int endPosition = com.zanlabs.widget.infiniteviewpager.InfiniteViewPager.FakePositionHelper.getEndPosition(viewPager);
    if (position < startPostion) {
        return ((endPosition + 1) - realAdapterSize) + (position % realAdapterSize);
    }
    if (position > endPosition) {
        return startPostion + (position % realAdapterSize);
    }
    return position;
}