@java.lang.Override
protected java.lang.Object doInBackground(java.lang.Object[] params) {
    cache = com.kot32.ksimplelibrary.cache.ACache.get(getActivity());
    int t = baseAction.initLocalData();
    switch (t) {
        case com.kot32.ksimplelibrary.activity.i.IBaseAction.LOAD_NETWORK_DATA_AND_SHOW :
            baseAction.onLoadingNetworkData();
            break;
        case com.kot32.ksimplelibrary.activity.i.IBaseAction.LOAD_NETWORK_DATA_AND_DISMISS :
            android.os.Message message = new android.os.Message();
            message.what = 1;
            mHandler.sendMessage(message);
            baseAction.onLoadingNetworkData();
            break;
        case com.kot32.ksimplelibrary.activity.i.IBaseAction.DONT_LOAD_NETWORK_DATA :
            break;
    }
    return null;
}