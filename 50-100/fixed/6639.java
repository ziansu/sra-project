@java.lang.Override
public void onBackPressed() {
    if (((databaseLayout) != null) && (databaseLayout.onBackPressed())) {
        return ;
    }
    if (((options) != null) && (options.isClosable())) {
        android.content.Intent intent = new android.content.Intent(Lock.CANCELED_ACTION);
        android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        return ;
    }
    super.onBackPressed();
}