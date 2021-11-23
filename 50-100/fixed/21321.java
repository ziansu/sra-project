@java.lang.Override
public void updateGroupInfo(com.tencent.TIMGroupCacheInfo info) {
    for (com.tencent.qcloud.timchat.model.Conversation conversation : conversationList) {
        if (((conversation.getIdentify()) != null) && (conversation.getIdentify().equals(info.getGroupInfo().getGroupId()))) {
            adapter.notifyDataSetChanged();
            return ;
        }
    }
}