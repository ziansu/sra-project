@java.lang.Override
public void onClick(android.view.View v) {
    mViewPagerAdapter.removeItem(mVideoShowPager.getCurrentItem());
    mViewPagerAdapter.notifyDataSetChanged();
    if ((mViewPagerAdapter.getCount()) <= 0) {
        return ;
    }
    if ((mVideoChangedListener) != null) {
        mVideoChangedListener.onChanged(((com.v2tech.widget.VideoShowFragment) (mViewPagerAdapter.getItem(mVideoShowPager.getCurrentItem()))));
    }
}