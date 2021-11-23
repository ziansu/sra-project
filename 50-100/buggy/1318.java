public void setLoadingState(com.sonaive.v2ex.widget.LoadingStatus loadingState) {
    if (loadingState == (LoadingStatus.FINISH)) {
        setLoading(false);
        setMoreDataToLoad(true);
        incrementPageIndex();
    }else
        if (loadingState == (LoadingStatus.NO_MORE_DATA)) {
            setLoading(false);
            setMoreDataToLoad(false);
            incrementPageIndex();
        }else {
            setLoading(true);
            setMoreDataToLoad(false);
        }
    
}