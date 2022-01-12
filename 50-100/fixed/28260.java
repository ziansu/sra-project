public void addToEnd(java.util.List<MESSAGE> messages) {
    int oldSize = mItems.size();
    for (int i = (messages.size()) - 1; i >= 0; i--) {
        MESSAGE message = messages.get(i);
        mItems.add(new Wrapper<>(message));
    }
    cn.jiguang.imui.messages.MsgListAdapter.notifyItemRangeInserted(oldSize, ((mItems.size()) - oldSize));
}