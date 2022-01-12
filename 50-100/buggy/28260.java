public void addToEnd(java.util.List<MESSAGE> messages) {
    int oldSize = mItems.size();
    for (int i = 0; i < (messages.size()); i++) {
        MESSAGE message = messages.get(i);
        mItems.add(new Wrapper<>(message));
    }
    cn.jiguang.imui.messages.MsgListAdapter.notifyItemRangeInserted(oldSize, ((mItems.size()) - oldSize));
}