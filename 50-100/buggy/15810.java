private void layoutChildren() {
    if (blockLayoutRequests) {
        return ;
    }
    blockLayoutRequests = true;
    flingStop();
    invalidate();
    recyclerCollection.scrapAll();
    detachAllViewsFromParent();
    switch (direction) {
        case com.chris.recycler.collectionview.constants.RCDirection.TOP_TO_BOTTOM :
            fillDown(findSectionByPosition(firstPosition), mPosY);
            trackPinnedView(firstPosition, getChildCount());
            correctGap(true);
            correctScroll();
            break;
        case com.chris.recycler.collectionview.constants.RCDirection.BOTTOM_TO_TOP :
            break;
        case com.chris.recycler.collectionview.constants.RCDirection.LEFT_TO_RIGHT :
            break;
        case com.chris.recycler.collectionview.constants.RCDirection.RIGHT_TO_LEFT :
            break;
    }
    blockLayoutRequests = false;
}