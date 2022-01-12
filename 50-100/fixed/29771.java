public void setRouterType(@com.mapswithme.maps.Framework.RouterType
int router) {
    mLogger.d(((("setRouterType: " + (mLastRouterType)) + " -> ") + router));
    mLastRouterType = router;
    com.mapswithme.maps.Framework.nativeSetRouter(router);
    if (((mStartPoint) != null) && ((mEndPoint) != null))
        build();
    
}