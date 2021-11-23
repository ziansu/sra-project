public void dataChanged() {
    chatList = presenter.getChatList();
    adapter = new internetofeveryone.ioe.Messenger.MessengerAdapter(chatList);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            presenter.onChatClicked(adapter.getItem(position));
        }
    });
}