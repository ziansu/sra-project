@java.lang.Override
public void onChange(io.realm.RealmResults<org.fossasia.susi.ai.model.ChatMessage> element) {
    notifyItemInserted(((this.itemList.size()) - 1));
    if ((recyclerView) != null) {
        recyclerView.smoothScrollToPosition(((this.itemList.size()) - 1));
    }
}