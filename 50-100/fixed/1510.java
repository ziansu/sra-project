@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if ((loopPagerAdapterWrapper.getCount()) > 0) {
        float length = ((position % (bannerInfos.size())) + positionOffset) / ((bannerInfos.size()) - 1);
        if (length >= 1)
            return ;
        
        float path = length * (totalDistance);
        android.support.v4.view.ViewCompat.setTranslationX(animIndicator, path);
    }
}