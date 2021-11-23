@java.lang.Override
public void onReplyBtnClicked(int position) {
    mReplyCommentsPosition = position;
    hideEditBar();
    showReplyFootBar();
    mHandler.sendEmptyMessageDelayed(com.dhn.marrysocial.fragment.DynamicInfoFragment.SHOW_SOFT_INPUT_METHOD, 50);
    android.os.Message msg = mHandler.obtainMessage();
    msg.what = com.dhn.marrysocial.fragment.DynamicInfoFragment.SELECT_SPECIFIED_LIST_ITEM;
    msg.arg1 = position;
    mHandler.sendMessage(msg);
}