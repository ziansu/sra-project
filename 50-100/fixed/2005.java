@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((mOnChangeItemListener) != null) {
        if ((intent.getIntExtra("position", 0)) >= 0) {
            mOnChangeItemListener.onChangeItem(intent.getIntExtra("position", 0));
        }
        if (intent.getBooleanExtra("onDestroy", false)) {
            mOnChangeItemListener.onDestroy();
        }
    }
}