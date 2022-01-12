public void onLoaded(java.lang.Integer reqId, java.lang.Long id, android.graphics.Bitmap b) {
    com.fwgg8547.mycast.Lg.w(com.fwgg8547.mycast.ExploerViewAdapter.TAG, ((((("onloaded id =" + id) + " pos =") + reqId) + "table sz=") + (mTable.size())));
    com.fwgg8547.mycast.ExploerViewAdapter.ExploerViewHolder holder = mTable.remove(reqId);
    if (holder != null) {
        mHander.notifyHolderUpdate(reqId, holder);
    }else {
        com.fwgg8547.mycast.Lg.w(com.fwgg8547.mycast.ExploerViewAdapter.TAG, ("pos is null " + reqId));
    }
}