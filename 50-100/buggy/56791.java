protected void updateDisplay() {
    android.util.Log.d("MessageThread", java.lang.String.valueOf(MessageThread));
    xyz.garrulous.garrulous.Adapter.MessageAdapter messageAdapter = new xyz.garrulous.garrulous.Adapter.MessageAdapter(this, R.layout.message_list, MessageThread);
    final android.widget.ListView messageThread = ((android.widget.ListView) (findViewById(R.id.listView2)));
    messageThread.setAdapter(messageAdapter);
}