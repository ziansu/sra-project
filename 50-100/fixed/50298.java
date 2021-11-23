@java.lang.Override
public void onMyLocationChange(android.location.Location location) {
    mUserLocation = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    if (!(isShowMyLocationFirstTime)) {
        showMyLocation();
        isShowMyLocationFirstTime = true;
        new com.hunters.pon.api.ShopAPIHelper().getMapShopCoupon(mContext, location.getLatitude(), location.getLongitude(), "1", mHanlderGetMapShopCoupon);
    }
}