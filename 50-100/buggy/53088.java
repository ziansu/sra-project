@java.lang.Override
public void onChange(io.realm.RealmResults<org.fossasia.susi.ai.model.ChatMessage> element) {
    notifyItemInserted(((itemList.size()) - 1));
    if (((recyclerView) != null) && shouldScrollToBottom) {
        recyclerView.smoothScrollToPosition(((itemList.size()) - 1));
    }
}