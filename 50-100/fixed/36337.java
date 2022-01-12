@java.lang.Override
public void onClick(android.view.View v) {
    mGetEditText = mEditText.getText().toString();
    if (!("".equals(mGetEditText.trim()))) {
        com.client.testsocket.Msg msg = new com.client.testsocket.Msg(mGetEditText, Msg.TYPE_SEND);
        msgList.add(msg);
        adapter.notifyDataSetChanged();
        mListView.setSelection(msgList.size());
        mEditText.setText("");
        new com.client.testsocket.MainActivity.MyThread(mGetEditText).start();
    }
}