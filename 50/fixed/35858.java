@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.support.v4.content.LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this);
    mLastErrorCode = intent.getIntExtra(ApiRequestService.EXTENDED_ERROR_CODE, ErrorCode.NO_ERROR);
    onContentChanged();
}