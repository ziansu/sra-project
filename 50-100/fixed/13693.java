private void setData() {
    mCurrentItem = 1;
    note.lym.org.noteproject.view.basepager.CommonPagerAdapter adapter = new note.lym.org.noteproject.view.basepager.CommonPagerAdapter(mData, true, mCreate);
    mPager.addOnPageChangeListener(this);
    mPager.setAdapter(adapter);
    mPager.setCurrentItem(1);
    mPager.setOnTouchListener(touch);
    if ((isAutoPlay) && ((count) > 1)) {
        startAutoPager();
    }
}