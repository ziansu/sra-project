@java.lang.Override
public void onActionTopicClicked(com.cngu.androidfun.data.ActionTopic topic, com.cngu.androidfun.main.TopicListAdapter.ViewHolder viewHolder) {
    if (mTopicManager.isActionTopicReached()) {
        mTopicManager.popTopicFromHistory();
    }
    mTopicManager.pushTopicToHistory(topic);
}