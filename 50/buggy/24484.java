@java.lang.Override
protected void logEvent(final java.lang.String event) {
    java.lang.String manager = getFragmentManager().toString();
    java.lang.String format = com.pajato.android.gamechat.chat.BaseChatFragment.FORMAT_NO_BUNDLE;
    android.util.Log.v(com.pajato.android.gamechat.chat.BaseChatFragment.TAG, java.lang.String.format(java.util.Locale.US, format, event, this, manager, mItemListType));
}