public void dataChanged() {
    java.util.TreeMap<java.lang.Long, internetofeveryone.ioe.Data.Message> msgList = presenter.getMessageList(userCode);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.chat_list)));
    adapter = new internetofeveryone.ioe.Chat.ChatAdapter(msgList, userCode);
    listView.setAdapter(adapter);
    if ((msgList.size()) > 0) {
        listView.setSelection(((msgList.size()) - 1));
    }
}