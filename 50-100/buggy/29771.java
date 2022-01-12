public void setRouterType(@com.mapswithme.maps.Framework.RouterType
int router) {
    mLogger.d(((("setRouterType: " + (mLastRouterType)) + " -> ") + router));
    if ((router == (mLastRouterType)) && (!(isTaxiRouterType())))
        return ;
    
    mLastRouterType = router;
    com.mapswithme.maps.Framework.nativeSetRouter(router);
    if (((mStartPoint) != null) && ((mEndPoint) != null))
        build();
    
}