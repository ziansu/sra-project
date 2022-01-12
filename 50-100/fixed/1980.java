private void addMessage(final com.mattfred.androidai.models.Message message) {
    adapter.addMessage(message);
    input.setText("");
    if (message.isUser()) {
        thinking.setVisibility(View.VISIBLE);
        new java.lang.Thread() {
            @java.lang.Override
            public void run() {
                controller.analyzeText(message.getContent());
            }
        }.start();
    }
    messageArea.scrollToPosition(((adapter.getItemCount()) - 1));
}