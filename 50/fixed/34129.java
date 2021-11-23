@java.lang.Override
public void onTextMessage(java.lang.String message) {
    updateConsole(((getString(R.string.server_to_client)) + message), MessageAdapter.Type.RECEIVED);
}