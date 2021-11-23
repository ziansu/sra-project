public void cacheBackgroundAtPosition(com.ramotion.expandingcollection.ECPager pager, int position) {
    if ((position >= 0) && (position < (pager.getAdapter().getCount()))) {
        java.lang.Integer mainBgImageDrawableResource = pager.getDataFromAdapterDataset(position).getMainBackgroundResource();
        android.graphics.drawable.BitmapDrawable mainBgImageDrawable = pager.getDataFromAdapterDataset(position).getMainBackgroundDrawable();
        com.ramotion.expandingcollection.BitmapWorkerTask addBitmapToCacheTask = new com.ramotion.expandingcollection.BitmapWorkerTask(getResources(), mainBgImageDrawable, mainBgImageDrawableResource);
        addBitmapToCacheTask.execute(position);
    }
}