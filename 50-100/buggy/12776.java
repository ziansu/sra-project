private org.projectbuendia.client.ui.SnackBar.Message getMessage(@android.support.annotation.StringRes
int message) {
    org.projectbuendia.client.ui.SnackBar.Message theMessage = null;
    for (java.util.Map.Entry<org.projectbuendia.client.ui.SnackBar.MessageKey, org.projectbuendia.client.ui.SnackBar.Message> entry : org.projectbuendia.client.ui.SnackBar.mMessagesList.entrySet()) {
        org.projectbuendia.client.ui.SnackBar.Message value = entry.getValue();
        if ((value.message) == message) {
            theMessage = value;
        }
    }
    return theMessage;
}