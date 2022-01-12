public static int getFakeFromReal(com.zanlabs.widget.infiniteviewpager.InfiniteViewPager viewPager, int real) {
    int realAdapterSize = (viewPager.getAdapterSize()) / (com.zanlabs.widget.infiniteviewpager.InfiniteViewPager.FakePositionHelper.MULTIPLIER);
    if (realAdapterSize == 0)
        return 0;
    
    return real % realAdapterSize;
}