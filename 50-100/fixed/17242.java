private org.projectbuendia.client.ui.SnackBar.MessageKey getKey(@android.support.annotation.StringRes
int message) {
    org.projectbuendia.client.ui.SnackBar.MessageKey theKey = null;
    for (java.util.Map.Entry<org.projectbuendia.client.ui.SnackBar.MessageKey, org.projectbuendia.client.ui.SnackBar.Message> entry : org.projectbuendia.client.ui.SnackBar.mMessagesList.entrySet()) {
        org.projectbuendia.client.ui.SnackBar.MessageKey key = entry.getKey();
        org.projectbuendia.client.ui.SnackBar.Message value = entry.getValue();
        if ((value.message) == message) {
            theKey = key;
            break;
        }
    }
    return theKey;
}