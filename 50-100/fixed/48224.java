public static int getRealFromFake(com.zanlabs.widget.infiniteviewpager.InfiniteViewPager viewPager, int fake) {
    int realAdapterSize = (viewPager.getAdapterSize()) / (com.zanlabs.widget.infiniteviewpager.InfiniteViewPager.FakePositionHelper.MULTIPLIER);
    if (realAdapterSize == 0)
        return 0;
    
    fake = fake % realAdapterSize;
    int currentReal = viewPager.getFakeCurrentItem();
    int real = fake + (currentReal - (currentReal % realAdapterSize));
    return real;
}