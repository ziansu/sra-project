@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((mOnChangeItemListener) != null) {
        mOnChangeItemListener.onChangeItem(intent.getIntExtra("position", 0));
        if (intent.getBooleanExtra("onDestroy", false)) {
            mOnChangeItemListener.onDestroy();
        }
    }
}