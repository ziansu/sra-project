public void sendMessage(java.lang.String message) {
    if ((displayMessageFragment) == null) {
        android.util.Log.w(com.e_conomic.jonfirstapp.MainActivity.MAIN_ACTIVITY_TAG, "Trying to send message, but displayMessageFragment is null.");
        return ;
    }
    displayMessageFragment.updateMessage(message);
    writeMessageToFile(message);
}