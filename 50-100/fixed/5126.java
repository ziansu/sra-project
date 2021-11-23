@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    for (int i = (selected.size()) - 1; i >= 0; i--) {
        if (selected.valueAt(i)) {
            com.beautypop.viewmodel.ConversationVM item = adapter.getItem(selected.keyAt(i));
            adapter.deleteConversation(item.getId());
        }
    }
}