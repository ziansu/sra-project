@java.lang.Override
public void onMapClick(com.baidu.mapapi.model.LatLng latLng) {
    com.blankj.utilcode.utils.ToastUtils.showShortToast(mContext, (((latLng.latitude) + ",") + (latLng.longitude)));
    hmPos = latLng;
    marker.setPosition(latLng);
}