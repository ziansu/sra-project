@java.lang.Override
public void done(com.parse.ParseException e) {
    mChatInput.setEnabled(true);
    mSend.setEnabled(true);
    if (e != null) {
        e.printStackTrace();
        return ;
    }
    mChatInput.setText("");
    mAdapter.addItem(message);
    mAdapter.notifyDataSetChanged();
    mList.scrollToPosition(((mAdapter.getItemCount()) - 1));
}