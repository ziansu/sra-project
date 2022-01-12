private void setupRetryLayout(com.zhy.base.loadandretry.OnLoadingAndRetryListener listener, com.zhy.base.loadandretry.LoadingAndRetryLayout loadingAndRetryLayout) {
    if (listener.isSetRetryLayout()) {
        int layoutId = listener.generateRetryLayoutId();
        if (layoutId != (com.zhy.base.loadandretry.LoadingAndRetryManager.NO_LAYOUT_ID)) {
            loadingAndRetryLayout.setRetryView(layoutId);
        }else {
            loadingAndRetryLayout.setRetryView(listener.generateRetryLayout());
        }
    }else {
        if ((com.zhy.base.loadandretry.LoadingAndRetryManager.BASE_RETRY_LAYOUT_ID) != (com.zhy.base.loadandretry.LoadingAndRetryManager.NO_LAYOUT_ID))
            loadingAndRetryLayout.setRetryView(com.zhy.base.loadandretry.LoadingAndRetryManager.BASE_RETRY_LAYOUT_ID);
        
    }
}