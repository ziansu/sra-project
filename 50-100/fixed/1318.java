public void setLoadingState(com.sonaive.v2ex.widget.LoadingStatus loadingState) {
    if (loadingState == (LoadingStatus.FINISH)) {
        setLoading(false);
        setMoreDataToLoad(true);
    }else
        if (loadingState == (LoadingStatus.NO_MORE_DATA)) {
            setLoading(false);
            setMoreDataToLoad(false);
        }else {
            setLoading(true);
            setMoreDataToLoad(false);
        }
    
}