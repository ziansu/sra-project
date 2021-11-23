public void sendMessage(java.lang.String message) {
    if ((displayMessageFragment) != null) {
        displayMessageFragment.updateMessage(message);
    }else {
        android.util.Log.w(com.e_conomic.jonfirstapp.MainActivity.MAIN_ACTIVITY_TAG, "Trying to send message, but displayMessageFragment is null.");
    }
    writeMessageToFile(message);
}