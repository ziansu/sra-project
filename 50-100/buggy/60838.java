@java.lang.Override
public void run() {
    mChatView.dismissRightBtn();
    cn.jpush.im.android.api.model.GroupInfo groupInfo = ((cn.jpush.im.android.api.model.GroupInfo) (mConv.getTargetInfo()));
    if (android.text.TextUtils.isEmpty(groupInfo.getGroupName())) {
        setChatTitle(com.ybg.yxym.im.chatting.utils.IdHelper.getString(mContext, "group"));
    }else {
        setChatTitle(groupInfo.getGroupName());
    }
    mChatView.dismissGroupNum();
}