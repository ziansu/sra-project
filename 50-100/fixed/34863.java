public void onCompletionReadingPage(java.lang.String fileName) {
    if (fileName.equalsIgnoreCase(Constant.COVER)) {
        mViewPager.setCurrentItem(1, true);
    }else
        if (!(fileName.equalsIgnoreCase(Constant.BACK_COVER))) {
            try {
                int position = (java.lang.Integer.parseInt(fileName)) + 1;
                mViewPager.setCurrentItem(position, true);
            } catch (java.lang.Exception e) {
            }
        }
    
}