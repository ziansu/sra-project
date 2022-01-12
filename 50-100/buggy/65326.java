public synchronized void updateMessages(java.lang.String msg, boolean local) {
    android.util.Log.e(com.example.jason.dinner_rush.DataConnection.TAG, ("Updating message: " + msg));
    android.os.Bundle messageBundle = new android.os.Bundle();
    messageBundle.putString("msg", msg);
    android.os.Message message = new android.os.Message();
    message.setData(messageBundle);
    mUpdateHandler.sendMessage(message);
}