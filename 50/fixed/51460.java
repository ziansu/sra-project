private void startChatThreadActivity(int position) {
    com.firebasechatdemo.ui.model.UserListModel item = chatListAdapter.getItem(position);
    startChatThreadActivity(item.id, item.title, item.image, false, null);
}