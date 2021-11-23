public void addMessageToChatRoomDataSet(com.m090009.sample.realim.models.Message message) {
    if (message != null) {
        this.adapter.addNewMessage(message);
        this.title.setText((("Messages (" + (this.adapter.getDataSet().size())) + ")"));
        ((android.support.v7.widget.LinearLayoutManager) (this.mainListView.getLayoutManager())).scrollToPositionWithOffset(((this.adapter.getDataSet().size()) - 1), 0);
    }
}