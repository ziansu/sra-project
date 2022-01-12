public void cacheBackgroundAtPosition(com.ramotion.expandingcollection.ECPager pager, int position) {
    if ((position >= 0) && (position < (pager.getAdapter().getCount()))) {
        java.lang.Integer mainBgImageDrawableResource = pager.getDataFromAdapterDataset(position).getMainBackgroundResource();
        if (mainBgImageDrawableResource == null)
            return ;
        
        com.ramotion.expandingcollection.BitmapWorkerTask addBitmapToCacheTask = new com.ramotion.expandingcollection.BitmapWorkerTask(getResources(), mainBgImageDrawableResource);
        addBitmapToCacheTask.execute(position);
    }
}