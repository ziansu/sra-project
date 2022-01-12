@java.lang.Override
public void onMyLocationChange(android.location.Location location) {
    mUserLocation = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    if (!(isShowMyLocationFirstTime)) {
        showMyLocation();
        isShowMyLocationFirstTime = true;
        double lat = 10.839812;
        double lng = 106.780339;
        new com.hunters.pon.api.ShopAPIHelper().getMapShopCoupon(mContext, lat, lng, "1", mHanlderGetMapShopCoupon);
    }
}