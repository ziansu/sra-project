@java.lang.Override
public void updateGroupInfo(com.tencent.TIMGroupCacheInfo info) {
    for (com.tencent.qcloud.timchat.model.Conversation conversation : conversationList) {
        if (((conversation.getIdentify()) != null) && (conversation.getIdentify().equals(info.getGroupInfo().getGroupId()))) {
            java.lang.String name = info.getGroupInfo().getGroupName();
            if (name.equals("")) {
                name = info.getGroupInfo().getGroupId();
            }
            adapter.notifyDataSetChanged();
            return ;
        }
    }
}