public synchronized void updateMessages(java.lang.String msg, boolean local) {
    if (local) {
        return ;
    }
    android.os.Bundle messageBundle = new android.os.Bundle();
    messageBundle.putString("msg", msg);
    android.os.Message message = new android.os.Message();
    message.setData(messageBundle);
    mUpdateHandler.sendMessage(message);
}