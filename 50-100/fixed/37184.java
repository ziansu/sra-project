private void onActivePointerUp() {
    if (com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isSwipingToRefresh(mStatus)) {
        setRefreshing(false);
    }else
        if (com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isSwipingToLoadMore(mStatus)) {
            setLoadingMore(false);
        }else
            if (com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isReleaseToRefresh(mStatus)) {
                setRefreshing(true);
            }else
                if (com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isReleaseToLoadMore(mStatus)) {
                    setLoadingMore(true);
                }
            
        
    
}