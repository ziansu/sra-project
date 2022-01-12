private org.projectbuendia.client.ui.SnackBar.MessageKey getKey(int id) {
    org.projectbuendia.client.ui.SnackBar.MessageKey theKey = null;
    for (java.util.Map.Entry<org.projectbuendia.client.ui.SnackBar.MessageKey, org.projectbuendia.client.ui.SnackBar.Message> entry : org.projectbuendia.client.ui.SnackBar.mMessagesList.entrySet()) {
        org.projectbuendia.client.ui.SnackBar.MessageKey key = entry.getKey();
        if ((key.id) == id) {
            theKey = key;
            break;
        }
    }
    return theKey;
}