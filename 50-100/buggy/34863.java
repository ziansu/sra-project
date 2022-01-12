public void onCompletionReadingPage(java.lang.String fileName) {
    if (fileName.equalsIgnoreCase(Constant.COVER)) {
        mViewPager.setCurrentItem(1, true);
        mPagerAdapter.getFragment(1).startReading();
    }else
        if (!(fileName.equalsIgnoreCase(Constant.BACK_COVER))) {
            try {
                int position = (java.lang.Integer.parseInt(fileName)) + 1;
                mViewPager.setCurrentItem(position, true);
                mPagerAdapter.getFragment(position).startReading();
            } catch (java.lang.Exception e) {
            }
        }
    
}