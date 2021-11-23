public void removeOnProgressListener(com.hippo.dict.DictImportService.ProcessListener onProgressListener) {
    if (onProgressListener != null) {
        mListeners.remove(onProgressListener);
    }
    if (((mListeners.size()) == 0) && (null != (mDictUri))) {
        mDictNotification.setMax(mItemNum);
        mDictNotification.setFileName(com.hippo.util.TextUrl.getFileName(mDictUri.toString()));
        mListeners.add(mDictNotification.mNotificationListener);
    }
}