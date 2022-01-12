@java.lang.Override
public void onStatusOk(net.datafans.android.common.data.service.BaseResponse response, java.lang.Class<?> type) {
    super.onStatusOk(response, type);
    onEnd();
}