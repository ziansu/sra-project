@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btnSpeak :
            java.lang.String chat = ChatMessage.getText().toString();
            java.lang.String message = chat.trim();
            if (!(android.text.TextUtils.isEmpty(message))) {
                sendMessage(message, chat);
                ChatMessage.setText("");
            }
            break;
        default :
            break;
    }
}