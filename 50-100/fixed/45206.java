@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    boolean isSuccess = intent.getBooleanExtra("is_success", false);
    java.lang.String action = intent.getAction();
    if ((action != null) && (action.equals(com.wafflestudio.siksha.service.DownloadingJsonReceiver.ACTION_CURRENT_DOWNLOAD))) {
        if (isSuccess)
            onCompleteDownloadListener.onComplete();
        else
            onCompleteDownloadListener.onFail();
        
    }
}